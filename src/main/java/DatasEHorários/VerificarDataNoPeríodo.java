package DatasEHorários;

import java.util.Scanner;

public class VerificarDataNoPeríodo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia = scanner.nextInt();
        int mes = scanner.nextInt();
        int ano = scanner.nextInt();

        int diaInicio = 1, mesInicio = 1, anoInicio = 2023;
        int diaFim = 31, mesFim = 12, anoFim = 2023;

        boolean dentroDoPeriodo = (ano > anoInicio || (ano == anoInicio && (mes > mesInicio || (mes == mesInicio && dia >= diaInicio)))) &&
                (ano < anoFim || (ano == anoFim && (mes < mesFim || (mes == mesFim && dia <= diaFim))));

        if (dentroDoPeriodo) {
            System.out.println("Data dentro do período");
        } else {
            System.out.println("Data fora do período");
        }
        scanner.close();
    }
}

