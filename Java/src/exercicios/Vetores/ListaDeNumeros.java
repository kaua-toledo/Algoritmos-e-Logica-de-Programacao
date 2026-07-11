package exercicios.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class ListaDeNumeros {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N;

        do {
            System.out.print("Quantos números você vai digitar? (1-10): ");
            N = sc.nextInt();
        } while (N > 10 || N <= 0);

        double[] vet = new double[N];

        for (int i = 0; i <= N - 1; i++) {
            System.out.print("Digite um número: ");
            vet[i] = sc.nextDouble();
        }
        System.out.println();

        if (N > 0 && N <= 10) {
            System.out.println("* Números digitados");
            for (int i = 0; i < N; i++) {
                System.out.println(String.format("> %.1f", vet[i]));
            }
        }
        sc.close();
    }
}
