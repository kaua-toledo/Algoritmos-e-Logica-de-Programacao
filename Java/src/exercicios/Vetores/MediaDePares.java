package exercicios.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class MediaDePares {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N, somaPares = 0, contPares = 0;
        double mediaPares;

        System.out.print("Quantos elemento terá o vetor? ");
        N = sc.nextInt();

        int[] numeros = new int[N];

        for (i = 0; i < N; i++) {
            System.out.println("Digite um valor:");
            System.out.print("> ");
            numeros[i] = sc.nextInt();
        }

        for (i = 0; i < N; i++) {
            if (numeros[i] % 2 == 0) {
                somaPares = somaPares + numeros[i];
                contPares = contPares + 1;
            }
        }

        if (contPares == 0) {
            System.out.println("Nenhum número par foi encontrado.");
        } else {
            mediaPares = somaPares / contPares;
            System.out.println("* Média dos Pares = " + String.format("%.1f", mediaPares));
        }

        sc.close();
    }
}
