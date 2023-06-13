package br.com.iterasys;

public class Calculadora {

    public static int somarInteiros(int num1, int num2){
        int soma = num1 + num2;
        System.out.println("soma de  "+ num1 + "  + " + num2 + "  é igual a " + soma);
        return soma;
    }

    public static int subtrairInteiros(int num1, int num2) {
        int subtracao = num1 - num2;
        System.out.println("A subtração de  " + num1 + "  - " + num2 + "  é igual a " + subtracao);
        return subtracao;
    }

    public static int multiplicarInteiros(int num1, int num2) {
        int multiplicacao = num1 * num2;
        System.out.println("A Multiplicação de  " + num1 + "  x " + num2 + "  é igual a " + multiplicacao);
        return multiplicacao;
    }

    public static int dividirInteiros(int num1, int num2) {
        int divisao = num1 / num2;
        System.out.println("A Divisão de  " + num1 + "  / " + num2 + "  é igual a " + divisao);
        return divisao;
    }
}
