package CategoriasEClassificações;

import java.util.Scanner;

public class ClassificaçãoNúmero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número entre 1 e 30: ");
        int numero = sc.nextInt();

        if (numero >= 1 && numero <= 10) {
            System.out.println("O número pertence à faixa A (1 a 10).");
        } else if (numero >= 11 && numero <= 20) {
            System.out.println("O número pertence à faixa B (11 a 20).");
        } else if (numero >= 21 && numero <= 30) {
            System.out.println("O número pertence à faixa C (21 a 30).");
        } else {
            System.out.println("Número fora da faixa de 1 a 30.");
        }

        sc.close();
    }
}

