package exercicios.Matrizes;

import java.util.Scanner;

public class Matriz {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N, M, i, j, maior;

        System.out.print("Quantas linhas terá a matriz? ");
        N = sc.nextInt();
        System.out.print("Quantas colunas terá a matriz? ");
        M = sc.nextInt();

        int[][] mat = new int[N][M];

        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("* Matriz digitada:");
        for (i = 0; i < N; i++) {
            for (j = 0; j < M; j++) {
                System.out.print("  " + mat[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("* Maior valor de cada linha: ");
        for (i = 0; i < N; i++) {
            maior = mat[i][0];
            for (j = 1; j < M; j++) {
                if (maior < mat[i][j]) {
                    maior = mat[i][j];
                }
            }
            System.out.println((i + 1) + "º Linha: " + maior);
        }

        sc.close();
    }
}
