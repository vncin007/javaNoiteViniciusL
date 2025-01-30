package SituaçõesCotidianas;

import java.util.Scanner;

public class VeiculoNoPedagio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int placa = scanner.nextInt();

        if (placa % 2 == 0) {
            System.out.println("placas de final par");
        } else {
            System.out.println("placas de final ímpar");
        }
        scanner.close();
    }
}

