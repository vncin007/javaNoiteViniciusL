package OperaçõesMatemáticas;

import java.util.Scanner;

public class VerificarTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebendo os três lados do triângulo
        System.out.println("Digite o primeiro lado: ");
        int lado1 = sc.nextInt();

        System.out.println("Digite o segundo lado: ");
        int lado2 = sc.nextInt();

        System.out.println("Digite o terceiro lado: ");
        int lado3 = sc.nextInt();

        // Verificando se os lados formam um triângulo
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            System.out.println("Os lados formam um triângulo.");
        } else {
            System.out.println("Os lados não formam um triângulo.");
        }

        sc.close();
    }
}
