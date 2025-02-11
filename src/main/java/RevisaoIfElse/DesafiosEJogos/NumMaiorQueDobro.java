package RevisaoIfElse.DesafiosEJogos;

import java.util.Scanner;

public class NumMaiorQueDobro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();

        if (numero1 > 2 * numero2) {
            System.out.println("O primeiro número é maior que o dobro do segundo");
        } else {
            System.out.println("O primeiro número não é maior que o dobro do segundo");
        }
        scanner.close();
    }
}

