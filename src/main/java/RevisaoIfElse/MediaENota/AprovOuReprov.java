package RevisaoIfElse.MediaENota;

import java.util.Scanner;

public class AprovOuReprov {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a media do aluno: ");
        double media = sc.nextDouble();


        if (media >= 7) {
            System.out.println("Aluno aprovado com media " + media);
        } else if (media >= 5 && media < 7) {
            System.out.println("Aluno em recuperação com media " + media);
        } else {
            System.out.println("Aluno reprovado com media " + media);
        }

        sc.close();
    }
}

