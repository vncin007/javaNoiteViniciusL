package DesafiosEJogos;

import java.util.Scanner;

public class NumPositivOuNegativ {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        if (numero1 >= 0 && numero2 >= 0) {
            System.out.println("Ambos são positivos");
        } else if (numero1 < 0 && numero2 < 0) {
            System.out.println("Ambos são negativos");
        } else {
            System.out.println("Um é positivo e o outro é negativo");
        }
        scanner.close();
    }
}

