package RevisaoIfElse.MediaENota;

import java.util.Scanner;

public class MaiorEMenorNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();


        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();


        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();


        double maiorNota = Math.max(nota1, Math.max(nota2, nota3));
        double menorNota = Math.min(nota1, Math.min(nota2, nota3));


        System.out.println("A maior nota é: " + maiorNota);
        System.out.println("A menor nota é: " + menorNota);


        sc.close();
    }
}

