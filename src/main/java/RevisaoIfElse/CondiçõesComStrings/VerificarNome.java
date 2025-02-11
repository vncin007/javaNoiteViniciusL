package RevisaoIfElse.CondiçõesComStrings;

import java.util.Scanner;

public class VerificarNome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        // Recebendo o nome
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();


        // Verificando se o nome começa com 'A'
        if (nome.toUpperCase().charAt(0) == 'A') {
            System.out.println("O nome começa com a letra 'A'.");
        } else {
            System.out.println("O nome não começa com a letra 'A'.");
        }


        sc.close();
    }
}

