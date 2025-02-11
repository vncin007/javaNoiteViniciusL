package RevisaoIfElse.SituaçõesCotidianas;

import java.util.Scanner;

public class SistemaAutenticação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuarioCorreto = "Admin";
        String senhaCorreta = "2007";

        String usuario = scanner.next();
        String senha = scanner.next();

        if (usuario.equals(usuarioCorreto) && senha.equals(senhaCorreta)) {
            System.out.println("Login bem-sucedido");
        } else {
            System.out.println("Usuário ou senha incorretos");
        }
        scanner.close();
    }
}

