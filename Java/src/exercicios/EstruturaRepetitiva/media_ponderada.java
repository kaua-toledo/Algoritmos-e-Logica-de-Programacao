package exercicios.EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class media_ponderada {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double A, B, C, media, soma;
        int N;

        System.out.print("Quantos casos você vai digitar? ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("Digite três números: ");
            System.out.print("> ");
            A = sc.nextInt();
            System.out.print("> ");
            B = sc.nextInt();
            System.out.print("> ");
            C = sc.nextInt();

            soma = A * 2 + B * 3 + C * 5;
            media = soma / 10;

            System.out.println("* Média ponderada: " + String.format("%.1f", media));
        }
        sc.close();
    }
}
