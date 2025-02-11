package RevisaoIfElse.CondiçõesComStrings;

import java.util.Scanner;

public class VerificarSenha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String senhaEsperada = "2007";


        System.out.println("Digite a senha: ");
        String senhaDigitada = sc.nextLine();


        if (senhaDigitada.equals(senhaEsperada)) {
            System.out.println("Senha correta!");
        } else {
            System.out.println("Senha incorreta.");
        }


        sc.close();
    }
}

