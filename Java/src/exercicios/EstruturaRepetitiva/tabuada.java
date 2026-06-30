package exercicios.EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class tabuada {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, multiplicacao;

        System.out.print("Para qual número deseja a tabuada? ");
        N = sc.nextInt();

        while (N != 0) {
            for (int i = 1; i <= 10; i++) {
                multiplicacao = i * N;
                System.out.println(N + " x " + i + " = " + multiplicacao);
            }
            System.out.print("Para qual número deseja a tabuada? (0 P/ SAIR): ");
            N = sc.nextInt();
        }

        sc.close();
    }
}
