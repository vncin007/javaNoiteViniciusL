package RevisaoIfElse.CondiçõesComStrings;

import java.util.Scanner;

public class CompararPalavras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine();

        System.out.println("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine();

        if (palavra1.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras são iguais.");
        } else {
            System.out.println("As palavras são diferentes.");
        }

        sc.close();
    }
}

