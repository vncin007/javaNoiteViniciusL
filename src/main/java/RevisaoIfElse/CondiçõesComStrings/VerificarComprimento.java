package RevisaoIfElse.CondiçõesComStrings;

import java.util.Scanner;

public class VerificarComprimento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebendo a palavra
        System.out.println("Digite uma palavra: ");
        String palavra = sc.nextLine();

        // Verificando se a palavra tem mais de 5 caracteres
        if (palavra.length() > 5) {
            System.out.println("A palavra tem mais de 5 caracteres.");
        } else {
            System.out.println("A palavra não tem mais de 5 caracteres.");
        }

        sc.close();
    }
}

