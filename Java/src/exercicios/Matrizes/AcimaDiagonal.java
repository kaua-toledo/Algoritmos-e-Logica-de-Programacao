package exercicios.Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class AcimaDiagonal {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i, j, soma;

        System.out.print("Qual a ordem da matriz? ");
        N = sc.nextInt();

        int[][] mat = new int[N][N];

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        soma = 0;
        for (i = 0; i < N; i++) {
            for (j = i + 1; j < N; j++) {
                soma = soma + mat[i][j];
            }
        }

        System.out.println("Soma dos Elementos Acima da Diagonal Principal: " + soma);

        sc.close();
    }
}