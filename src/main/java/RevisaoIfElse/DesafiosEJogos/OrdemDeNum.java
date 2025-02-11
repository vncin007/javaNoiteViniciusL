package RevisaoIfElse.DesafiosEJogos;

import java.util.Scanner;
import java.util.Arrays;

public class OrdemDeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[3];

        for (int i = 0; i < 3; i++) {
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        scanner.close();
    }
}

