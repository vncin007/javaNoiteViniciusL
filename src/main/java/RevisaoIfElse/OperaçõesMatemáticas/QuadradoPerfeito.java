package RevisaoIfElse.OperaçõesMatemáticas;

import java.util.Scanner;

public class QuadradoPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num = sc.nextInt();

        double raiz = Math.sqrt(num);
        if (raiz == (int) raiz) {
            System.out.println(num + " é um quadrado perfeito.");
        } else {
            System.out.println(num + " não é um quadrado perfeito.");
        }

        sc.close();
    }
}

