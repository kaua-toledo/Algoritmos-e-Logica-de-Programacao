package exercicios.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N;
        double soma = 0, media;

        System.out.print("Quantos elementos terá o vetor? ");
        N = sc.nextInt();

        double[] vet = new double[N];

        for (i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();
            soma = soma + vet[i];
        }
        media = soma / N;

        System.out.println("* Vetor");
        for (i = 0; i < N; i++) {
            System.out.print(String.format("  %.1f", vet[i]));
        }

        System.out.println();
        System.out.println("* Soma: " + String.format("%.2f", soma));
        System.out.println("* Média: " + String.format("%.2f", media));

        sc.close();
    }
}
