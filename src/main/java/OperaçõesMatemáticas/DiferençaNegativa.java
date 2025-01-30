package OperaçõesMatemáticas;

import java.util.Scanner;

public class DiferençaNegativa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebendo dois números
        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        // Verificando se a diferença é negativa
        if ((num1 - num2) < 0) {
            System.out.println("A diferença entre os números é negativa.");
        } else {
            System.out.println("A diferença entre os números não é negativa.");
        }

        sc.close();
    }
}

