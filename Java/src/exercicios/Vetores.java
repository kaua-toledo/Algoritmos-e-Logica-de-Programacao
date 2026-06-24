package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {

    static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("Quantos números você vai digitar? ");
        N = sc.nextInt();

        double[] vet = new double[N];

        for (int i = 0; i < N; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();
        }

        System.out.println();
        System.out.println("* Números Digitados *");
        for (int i = 0; i < N; i++) {
            System.out.println(String.format("%.1f", vet[i]));
        }
        sc.close();
    }
}
