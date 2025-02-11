package RevisaoIfElse.DatasEHorários;

import java.util.Scanner;

public class VerificarHorário {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebendo o horário
        System.out.println("Digite o horário (formato 24 horas): ");
        int hora = sc.nextInt();
        int minuto = sc.nextInt();

        // Verificando se o horário é válido
        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60) {
            System.out.println("Horário válido.");
        } else {
            System.out.println("Horário inválido.");
        }

        sc.close();
    }
}

