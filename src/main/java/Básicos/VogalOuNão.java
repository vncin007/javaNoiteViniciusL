package Básicos;

import java.util.Scanner;

public class VogalOuNão {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um caractere: ");
        char caractere = sc.next().charAt(0);


        if (caractere == 'a' || caractere == 'e' || caractere == 'i' ||
                caractere == 'o' || caractere == 'u' || caractere == 'A' ||
                caractere == 'E' || caractere == 'I' || caractere == 'O' ||
                caractere == 'U') {
            System.out.println(caractere + " é uma vogal.");
        } else {
            System.out.println(caractere + " não é uma vogal.");
        }


        sc.close();
    }
}

