package RevisaoIfElse.DecisõesFinanceiras;

import java.util.Scanner;

public class BrindeCliente {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor da sua compra: ");
        double valorCompra = sc.nextDouble();

        if (valorCompra >= 100) {
            System.out.println("Você ganhou um brinde!");
        } else {
            System.out.println("Valor de compra insuficiente para ganhar um brinde.");
        }

        sc.close();
    }
}

