package exercicios.Vetores;

import java.util.Scanner;

public class SomaDeVetores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, N;

        System.out.print("Quantos elementos terá cada vetor? ");
        N = sc.nextInt();

        int[] A = new int[N];
        int[] B = new int[N];
        int[] C = new int[N];

        System.out.println("Digite os valores do primeiro vetor:");
        for (i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }

        System.out.println("Digite os valores do segundo vetor:");
        for (i = 0; i < N; i++) {
            B[i] = sc.nextInt();
        }

        for (i = 0; i < N; i++) {
            C[i] = A[i] + B[i];
        }

        System.out.println("* Vetor resultante");
        for (i = 0; i < N; i++) {
            System.out.println("[" + A[i] + "] + [" + B[i] + "] = " + C[i]);
        }

        sc.close();
    }
}
