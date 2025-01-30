package DecisõesFinanceiras;

import java.util.Scanner;

public class FinanciarImóvel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário: ");
        double salario = sc.nextDouble();

        if (salario >= 3000) {
            System.out.println("Você pode financiar um imóvel.");
        } else {
            System.out.println("Seu salário não é suficiente para financiar um imóvel.");
        }

        sc.close();
    }
}

