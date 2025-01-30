package CategoriasEClassificações;

import java.util.Scanner;

public class ClassificaçãoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebendo a temperatura em graus Celsius
        System.out.println("Digite a temperatura em graus Celsius: ");
        double temperatura = sc.nextDouble();

        // Classificando a temperatura
        if (temperatura < 15) {
            System.out.println("Está frio.");
        } else if (temperatura >= 15 && temperatura <= 25) {
            System.out.println("Está agradável.");
        } else {
            System.out.println("Está quente.");
        }

        sc.close();
    }
}

