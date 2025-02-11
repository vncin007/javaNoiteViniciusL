package RevisaoIfElse.OperaçõesMatemáticas;

import java.util.Scanner;

public class Divisibilidade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = sc.nextInt();

        if (num1 % num2 == 0) {
            System.out.println(num1 + " é divisível por " + num2);
        } else {
            System.out.println(num1 + " não é divisível por " + num2);
        }

        sc.close();
    }
}

