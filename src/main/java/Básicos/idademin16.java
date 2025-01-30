package Básicos;

import java.util.Scanner;

public class idademin16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Perguntar a idade da pessoa
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();


        // Verificar se a pessoa pode votar
        if (idade >= 16) {
            System.out.println("Você pode votar.");
        } else {
            System.out.println("Você não pode votar.");
        }


        sc.close();
    }
}
