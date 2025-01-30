package DesafiosEJogos;

import java.util.Scanner;
import java.util.Random;

public class JogoAcertoDeNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(10) + 1;
        int chute = scanner.nextInt();

        if (chute == numeroSorteado) {
            System.out.println("Parabéns! Você acertou o número sorteado!");
        } else {
            System.out.println("Errado! O número sorteado era " + numeroSorteado);
        }
        scanner.close();
    }
}

