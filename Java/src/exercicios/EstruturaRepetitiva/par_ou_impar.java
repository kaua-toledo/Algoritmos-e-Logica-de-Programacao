package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

public class par_ou_impar {
    
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, N;

        System.out.print("Quantos números você vai digitar? ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            X = sc.nextInt();
            if (X == 0) {
                System.out.println("Valor nulo.");
            } else if (X % 2 == 0) {
                if (X > 0) {
                    System.out.println("Par positivo.");
                } else {
                    System.out.println("Par negativo.");
                }
            } else if (X > 0) {
                System.out.println("Ímpar positivo.");
            } else {
                System.out.println("Ímpar negativo.");
            }
        }
        
        sc.close();
    }
}
