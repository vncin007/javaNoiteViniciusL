package RevisaoIfElse.Básicos;

import java.util.Scanner;

public class ExibirMaiorNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Num1");
        int num1 = sc.nextInt();


        System.out.println("Num2");
        int num2 = sc.nextInt();


        if (num1 > num2) {
            System.out.println("O maior num é:" + num1);
        } else if (num2 > num1) {
            System.out.println("O maior número é: " + num2);
        } else {
            System.out.println("Os dois números são iguais.");
        }


        sc.close();
    }
}
