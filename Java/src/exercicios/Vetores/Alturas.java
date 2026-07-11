package exercicios.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Variaveis
        int N, i, cont;
        double MediaAltura, SomaAltura = 0, MenorDe16;

        // Vetores
        String[] Nomes = new String[9];
        double[] Alturas = new double[9];
        int[] Idades = new int[9];


        System.out.print("Quantas pessoas vão ser digitadas? ");
        N = sc.nextInt();

        for (i = 0; i < N; i++) {
            System.out.println("* Dados da " + (i + 1) + "º pessoa");
            System.out.print("Nome: ");
            sc.nextLine(); // Para limpar o buffer
            Nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            Idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            Alturas[i] = sc.nextDouble();
        }

        cont = 0;
        for (i = 0; i < N; i++) {
            if (Idades[i] < 16) {
                cont = cont + 1;
            }
        }

        SomaAltura = 0;
        for (i = 0; i < N; i++) {
            SomaAltura = SomaAltura + Alturas[i];
        }

        MediaAltura = SomaAltura / N;
        MenorDe16 = (cont * 100) / N;

        System.out.println();
        System.out.println("* Resultados Finais");
        System.out.println("Altura média: " + String.format("%.2f", MediaAltura));
        System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", MenorDe16) + "%");

        for (i = 0; i < N; i++) {
            if (Idades[i] < 16) {
                System.out.println(Nomes[i]);
            }
        }

        sc.close();
    }
}
