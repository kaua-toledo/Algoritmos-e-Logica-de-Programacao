package exercicios.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i, maiorPosicao = 0;

        System.out.print("Quantos elementos terá o vetor? ");
        N = sc.nextInt();
        double[] vet = new double[N];

        for (i = 0; i < N; i++) {
            System.out.println("Digite um número");
            System.out.print("> ");
            vet[i] = sc.nextDouble();
        }

        double maior = vet[0];
        for (i = 1; i < N; i++) {
            if (maior < vet[i]) {
                maior = vet[i];
                maiorPosicao = i;
            }
        }

        System.out.println("* Maior Valor: " + String.format("%.2f", maior));
        System.out.println("* Posição no Vetor: " + maiorPosicao);

        sc.close();
    }
}
