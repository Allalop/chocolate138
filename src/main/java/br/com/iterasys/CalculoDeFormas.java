package br.com.iterasys;

public class CalculoDeFormas {

    public static void calcularQuadrado(int lado1, int lado2) {
        int area = lado1 * lado2;
        System.out.println("A area de um quadrado é " + area );
    }
    public static void calcularRetangulo(int comprimento, int largura) {
        int area = comprimento * largura;
        System.out.println("A area de um retangulo é " + area );
    }

    public static void calcularTriangulo(int base, int altura) {
        int area = (base * altura)/2;
        System.out.println("A area de um triangulo é " + area );
    }

    public static void calcularCirculo(double raio) {
        double area = (Math.PI * Math.pow(raio, 2));
            System.out.println("A area de um circulo é " + area);
    }



}

