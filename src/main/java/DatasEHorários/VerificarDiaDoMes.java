package DatasEHorários;

import java.util.Scanner;

public class VerificarDiaDoMes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mes = scanner.nextInt();
        int ano = scanner.nextInt();
        int dia = scanner.nextInt();

        boolean diaValido = false;
        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            diaValido = dia >= 1 && dia <= 31;
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diaValido = dia >= 1 && dia <= 30;
        } else if (mes == 2) {
            boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
            diaValido = dia >= 1 && dia <= (anoBissexto ? 29 : 28);
        }

        if (diaValido) {
            System.out.println("Dia válido");
        } else {
            System.out.println("Dia inválido");
        }
        scanner.close();
    }
}

