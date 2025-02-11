package RevisaoIfElse.SituaçõesCotidianas;

import java.util.Scanner;

public class NumCodigoDeAcesso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int codigoCorreto = 1234;
        int codigoDigitado = scanner.nextInt();

        if (codigoDigitado == codigoCorreto) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso incorreto");
        }
        scanner.close();
    }
}

