package DecisõesFinanceiras;

import java.util.Scanner;

public class DescontoCompra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor total da compra: ");
        double totalCompra = sc.nextDouble();

        if (totalCompra > 500) {
            double desconto = totalCompra * 0.10;
            double valorFinal = totalCompra - desconto;
            System.out.println("Desconto de 10% aplicado. Valor final: R$" + valorFinal);
        } else {
            System.out.println("Não há desconto aplicado.");
        }

        sc.close();
    }
}

