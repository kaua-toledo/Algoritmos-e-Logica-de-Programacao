package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

public class fatorial {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, fatorial = 1;

        System.out.print("Digite o valor de N (0-15): ");
        N = sc.nextInt();

        if (N > 15 || N < 0) {
            System.out.println("Valor inválido! Digite um número entre 0 e 15");
        } else {
            for (int i = 1; i <= N; i++) {
                fatorial = fatorial * i;
            }
        }

        System.out.println("Fatorial: " + fatorial);
        sc.close();
    }
}
