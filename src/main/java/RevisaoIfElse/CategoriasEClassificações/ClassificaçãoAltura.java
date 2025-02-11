package RevisaoIfElse.CategoriasEClassificações;

import java.util.Scanner;

public class ClassificaçãoAltura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Recebendo a altura da pessoa
        System.out.println("Digite a sua altura (em metros): ");
        double altura = sc.nextDouble();

        // Verificando a classificação da altura
        if (altura < 1.60) {
            System.out.println("Você é considerado(a) baixo(a).");
        } else if (altura >= 1.60 && altura <= 1.80) {
            System.out.println("Você é considerado(a) de altura média.");
        } else {
            System.out.println("Você é considerado(a) alto(a).");
        }

        sc.close();
    }
}

