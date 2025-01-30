package SituaçõesCotidianas;

import java.util.Scanner;

public class ConverterTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius = scanner.nextDouble();
        String opcao = scanner.next();

        if (opcao.equalsIgnoreCase("F")) {
            double fahrenheit = celsius * 9 / 5 + 32;
            System.out.printf("Temperatura em Fahrenheit: %.2f%n", fahrenheit);
        } else if (opcao.equalsIgnoreCase("K")) {
            double kelvin = celsius + 273.15;
            System.out.printf("Temperatura em Kelvin: %.2f%n", kelvin);
        } else {
            System.out.println("Opção inválida");
        }
        scanner.close();
    }
}

