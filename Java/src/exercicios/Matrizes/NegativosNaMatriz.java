package exercicios.Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class NegativosNaMatriz {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, m;

        System.out.print("Quantas linhas terá a matriz? ");
        n = sc.nextInt();
        System.out.print("Quantas colunas terá a matriz? ");
        m = sc.nextInt();

        double[][] mat = new double[n][m];

        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextDouble();
            }
        }

        System.out.println();
        System.out.println("* Números Negativos");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat[i][j] < 0) {
                    System.out.printf("  %.1f", mat[i][j]);
                }
            }
        }

        sc.close();
    }
}
