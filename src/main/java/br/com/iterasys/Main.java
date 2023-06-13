package br.com.iterasys;

public class Main {
    public static void main(String[] args) {
        System.out.println("Olá Allan!");
     // chamarEncomenda();
     // Calculadora.somarInteiros(5,7);
     // Calculadora.subtrairInteiros(7,5);
     // Calculadora.multiplicarInteiros(7,5);
     // Calculadora.dividirInteiros(100,5);
        CalculoDeFormas.calcularQuadrado(5,5);
        CalculoDeFormas.calcularRetangulo(10,25);
        CalculoDeFormas.calcularTriangulo(10,30);
        CalculoDeFormas.calcularCirculo(100);

    }

    public static void chamarEncomenda(){
        int barras = 30;
        Encomenda.calcularBarraDeChocolatePorCaixa(barras);
    }
}