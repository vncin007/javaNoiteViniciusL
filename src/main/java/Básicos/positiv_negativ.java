package Básicos;

import java.util.Scanner;

public class positiv_negativ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Positivo ou Negativo");


        int num = sc.nextInt();


        if (num > 0) {
            System.out.println("Positivo");
        } else if (num < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Zero");
        }


        sc.close();
    }
}