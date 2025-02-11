package RevisaoIfElse.Básicos;

import java.util.Scanner;

public class Intervalo10a50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um número: ");
        int num = sc.nextInt();


        if (num >= 10 && num <= 50) {
            System.out.println(num + " está no intervalo de 10 a 50.");
        } else {
            System.out.println(num + " não está no intervalo de 10 a 50.");
        }


        sc.close();
    }
}

