package RevisaoIfElse.MediaENota;

import java.util.Scanner;

public class MediaigualOuMaiorqueSete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite um número: ");
        int num = sc.nextInt();


        if (num >= 7) {
            System.out.println(num + " é maior ou igual a 7.");
        } else {
            System.out.println(num + " é menor que 7.");
        }
        sc.close();
    }
}




