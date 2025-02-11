package RevisaoIfElse.Básicos;

import java.util.Scanner;

public class Intervalo100a200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um número: ");
        int num = sc.nextInt();


        if (num >= 100 && num <= 200) {
            System.out.println(num + " está no intervalo de 100 a 200.");
        } else {
            System.out.println(num + " não está no intervalo de 100 a 200.");
        }


        sc.close();
    }
}

