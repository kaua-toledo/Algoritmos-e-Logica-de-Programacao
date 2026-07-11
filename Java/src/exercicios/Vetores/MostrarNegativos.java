package exercicios.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class MostrarNegativos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N, contNegativos = 0;

        System.out.print("Quantos números vão ser digitados? ");
        N = sc.nextInt();

        double[] vet = new double[N];

        for (i = 0; i < N; i++) {
            System.out.println("Digite um número");
            System.out.print("> ");
            vet[i] = sc.nextDouble();
        }

        for (i = 0; i < N; i++) {
            if (vet[i] < 0) {
                contNegativos = contNegativos + 1;
            }
        }

        if (contNegativos > 0) {
            System.out.println("* Números Negativos");
            for (i = 0; i < N; i++) {
                if (vet[i] < 0) {
                    System.out.println(vet[i]);
                }
            }
        } else {
            System.out.println("Nenhum número negativo foi encontrado.");
        }

        sc.close();
    }
}
