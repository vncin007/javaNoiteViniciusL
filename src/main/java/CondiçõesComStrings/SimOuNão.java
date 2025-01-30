package CondiçõesComStrings;

import java.util.Scanner;

public class SimOuNão {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        System.out.println("Digite 'Sim' ou 'Não': ");
        String resposta = sc.nextLine();


        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Você respondeu 'Sim'.");
        } else if (resposta.equalsIgnoreCase("Não")) {
            System.out.println("Você respondeu 'Não'.");
        } else {
            System.out.println("Resposta inválida. Por favor, digite 'Sim' ou 'Não'.");
        }


        sc.close();
    }
}

