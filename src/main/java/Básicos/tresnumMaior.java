package Básicos;

import java.util.Scanner;

public class tresnumMaior {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o primeiro num: ");
        int num1 = sc.nextInt();


        System.out.println("Digite o segundo num: ");
        int num2 = sc.nextInt();


        System.out.println("Digite o terceiro num: ");
        int num3 = sc.nextInt();
        int maior = num1;
        if (num2 > maior) {
            maior = num2;
        }


        if (num3 > maior) {
            maior = num3;
        }

        System.out.println("O maior num é: " + maior);


        sc.close();
    }
}

