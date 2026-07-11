package exercicios.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N;
        double soma = 0, media;

        System.out.print("Quantos elementos terá o vetor? ");
        N = sc.nextInt();

        double[] numeros = new double[N];

        for (i = 0; i < N; i++) {
            System.out.println("Digite um número:");
            System.out.print("> ");
            numeros[i] = sc.nextDouble();
            soma = soma + numeros[i];
        }
        System.out.println();

        media = soma / N;

        System.out.println("* Média do vetor: " + String.format("%.1f", media));
        System.out.println("* Números abaixo da média:");
        for (i = 0; i < N; i++) {
            if (numeros[i] < media) {
                System.out.println(String.format("%.1f", numeros[i]));
            }
        }

        sc.close();
    }
}
