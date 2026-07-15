package exercicios.Matrizes;

import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i, j, Linha, Coluna;
        double soma = 0;


        System.out.print("Qual a ordem da matriz? ");
        N = sc.nextInt();

        double mat[][] = new double[N][N];

        // Entrada de valores dos elementos da Matriz
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                System.out.print("Elemento [" + i + "," + j + "]: ");
                mat[i][j] = sc.nextDouble();
            }
        }

        // Soma os valores positivos da Matriz e imprime o resultado
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (mat[i][j] > 0) {
                    soma = soma + mat[i][j];
                }
            }
        }

        System.out.print("* Soma dos Elementos Positivos: " + soma);
        System.out.println();


        // Mostra o conteúdo da linha ecolhida
        System.out.println();
        System.out.println("Escolha uma linha (0-" + (N - 1) + "):");
        System.out.print("> ");
        Linha = sc.nextInt();

        for (j = 0; j < N; j++) {
            System.out.println(String.format("%.1f", mat[Linha][j]));
        }


        // Mostra o conteúdo da coluna escolhida
        System.out.println("Escolha uma coluna (0-" + (N - 1) + "):");
        System.out.print("> ");
        Coluna = sc.nextInt();

        for (i = 0; i < N; i++) {
            System.out.println(String.format("%.1f", mat[i][Coluna]));
        }


        // Mostra a diagonal principal da Matriz
        System.out.println();
        System.out.println("* Diagonal Principal:");
        for (i = 0; i < N; i++) {
            System.out.println("  " + mat[i][i]);
        }


        // Converte os valores negativos da matriz para positivos e imprime a matriz alterada
        System.out.println();
        System.out.println("* Matriz Alterada:");

        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                if (mat[i][j] < 0) {
                    mat[i][j] = Math.pow(mat[i][j], 2);
                    System.out.print(String.format("   %.1f", mat[i][j]));
                } else {
                    System.out.print(String.format("   %.1f", mat[i][j]));
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
