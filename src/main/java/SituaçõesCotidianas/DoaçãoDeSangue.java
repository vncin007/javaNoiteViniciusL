package SituaçõesCotidianas;

import java.util.Scanner;

public class DoaçãoDeSangue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade = scanner.nextInt();
        double peso = scanner.nextDouble();

        if (idade >= 18 && idade <= 65 && peso >= 50) {
            System.out.println("Apto para doar sangue");
        } else {
            System.out.println("Não apto para doar sangue");
        }
        scanner.close();
    }
}

