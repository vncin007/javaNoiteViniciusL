package RevisaoIfElse.DecisõesFinanceiras;

import java.util.Scanner;

public class VerificarSaldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.println("Digite o valor do saque: ");
        double saque = sc.nextDouble();

        if (saldo >= saque) {
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para o saque.");
        }

        sc.close();
    }
}

