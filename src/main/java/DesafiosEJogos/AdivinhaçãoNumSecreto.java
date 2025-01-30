package DesafiosEJogos;

import java.util.Scanner;

public class AdivinhaçãoNumSecreto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = 7;
        int chute = scanner.nextInt();

        if (chute == numeroSecreto) {
            System.out.println("Parabéns! Você acertou!");
        } else {
            System.out.println("Errado! Tente novamente.");
        }
        scanner.close();
    }
}

