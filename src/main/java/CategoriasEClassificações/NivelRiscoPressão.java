package CategoriasEClassificações;

import java.util.Scanner;

public class NivelRiscoPressão {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a sua pressão arterial sistólica: ");
        int sistolica = sc.nextInt();

        System.out.println("Digite a sua pressão arterial diastólica: ");
        int diastolica = sc.nextInt();

        if (sistolica < 120 && diastolica < 80) {
            System.out.println("Sua pressão arterial é normal.");
        } else if ((sistolica >= 120 && sistolica < 130) && (diastolica < 80)) {
            System.out.println("Sua pressão arterial está em nível moderado.");
        } else if (sistolica >= 130 || diastolica >= 80) {
            System.out.println("Sua pressão arterial está alta.");
        } else {
            System.out.println("Valores de pressão arterial inválidos.");
        }

        sc.close();
    }
}

