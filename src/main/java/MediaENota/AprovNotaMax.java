package MediaENota;

import java.util.Scanner;

public class AprovNotaMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();


        System.out.println("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();


        System.out.println("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();

        if (nota1 >= 10 || nota2 >= 10 || nota3 >= 10) {
            System.out.println("O aluno recebeu nota máxima (>= 10) em pelo menos uma disciplina.");
        } else {
            System.out.println("O aluno não recebeu nota máxima em nenhuma disciplina.");
        }


        sc.close();
    }
}

