package exercicios.Matrizes;

import java.util.Scanner;

public class SomaMatrizes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m;

        System.out.print("Quantas linhas terá cada matriz? ");
        n = sc.nextInt();
        System.out.print("Quantas colunas terá cada matriz? ");
        m = sc.nextInt();

        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        int[][] c = new int[n][m];

        System.out.println();
        System.out.println("Digite os valores da 1º matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Digite os valores da 2º matriz");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("* MATRIZ SOMA:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print("  " + c[i][j]);
            }
            System.out.println();
        }


        sc.close();
    }
}
