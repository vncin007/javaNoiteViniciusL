package RevisaoIfElse.Básicos;

import java.util.Scanner;

public class MultiplodeCinco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um num: ");
        int num = sc.nextInt();


        if (num == 5) {
            System.out.println(num + " é multiplo de 5.");
        } else {
            System.out.println(num + " não é multiplo de 5.");
        }


        sc.close();
    }
}

