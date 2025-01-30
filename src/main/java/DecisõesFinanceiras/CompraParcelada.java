package DecisõesFinanceiras;

import java.util.Scanner;

public class CompraParcelada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = sc.nextDouble();

        System.out.println("Digite o valor da parcela: ");
        double parcela = sc.nextDouble();

        if (parcela <= salario * 0.10) {
            System.out.println("Você pode comprar o produto parcelado.");
        } else {
            System.out.println("A parcela é maior que 10% do seu salário.");
        }

        sc.close();
    }
}

