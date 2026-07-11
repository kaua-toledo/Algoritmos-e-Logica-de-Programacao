package exercicios.Vetores;

import java.util.Scanner;

public class MaisVelho {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i, N, maisVelho, maiorPosicao;

        System.out.print("Quantas pessoas vão integrar a lista? ");
        N = sc.nextInt();

        int[] idades = new int[N];
        String[] nomes = new String[N];

        for (i = 0; i < N; i++) {
            System.out.println(" * Dados da " + (i + 1) + "º pessoa");
            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
        }

        maisVelho = idades[0];
        maiorPosicao = 0;
        for (i = 1; i < N; i++) {
            if (maisVelho < idades[i]) {
                maisVelho = idades[i];
                maiorPosicao = i;
            }
        }

        System.out.println("* " + nomes[maiorPosicao] + " é a pessoa mais velha da lista, com " + maisVelho + " anos.");

        sc.close();
    }
}
