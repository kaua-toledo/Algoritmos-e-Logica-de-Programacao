package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

public class intervalo {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, x, contF = 0, contD = 0;

        System.out.print("Quantos números você vai digitar? ");
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            x = sc.nextInt();
            if (x <= 20 && x >= 10) {
                contD = contD + 1;
            } else {
                contF = contF + 1;
            }
        }
        System.out.println("* Números dentro do intervalo (10-20): " + contD);
        System.out.println("* Números fora do intervalo (10-20): " + contF);
        sc.close();
    }
}
