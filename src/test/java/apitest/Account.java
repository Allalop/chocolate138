// 1 -Pacote
package apitest;

import com.google.gson.Gson;
import entities.AccountEntity;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;


// 2 - biblioteca
// 3 - classe
public class Account {
    //3.1 - Atributos
    String userID;
    //3.1.2 - instanciar classes externas
    Gson gson = new Gson();

    //3.2- métodos funções

    //metodo 1 - criar usuário
    @Test
    public void testCreateUser(){

     //fim do método de criação de usuário
        // Arrenge - configura
        AccountEntity account = new AccountEntity();
        account.userName = "ARLARL12"; // entrada e saída (resultado esperado)
        account.password = "Allan@10"; // entrada

        String jsonBody = gson.toJson(account) ; //converte classe em Json

        // Act - Executa
        //dado -  Quando - Então
        //Given - When - Then

        Response resposta = (Response) given()
                .contentType("application/json") // tipo do conteudo
                .log().all()                       // registre tudo
                .body(jsonBody)                        // corpo da mensagem que será enviada
        .when()
                .post("https://bookstore.toolsqa.com/Account/v1/User")

        // Asser - Valida
        .then()
                .log().all()
                .statusCode(201)
                .body("username", is(account.userName))
                .extract() // extrai o userID.
                ;

        //extrair o user ID
        userID = resposta.jsonPath().getString("userID");
        System.out.println("O UseId extraido: " + userID);
    }

    @Test
    public void testGenerateToken(){
        //configura
        //executa
        //valida

    } // fim do método de geração de tonken de identificação de usuário teste 4


}
