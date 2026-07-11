package exercicios.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class DadosDePessoas {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int i, N, contM = 0, contF = 0;
        double menorAltura, maiorAltura, somaAlturaM, mediaAlturaM, mediaAlturaF, somaAlturaF;


        System.out.print("Quantas pessoas serão digitadas? ");
        N = sc.nextInt();

        double[] alturas = new double[N];
        char[] generos = new char[N];

        for (i = 0; i < N; i++) {
            System.out.println();
            System.out.println("Dados da " + (i + 1) + "º Pessoa");
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
            System.out.print("Gênero: ");
            sc.nextLine();
            generos[i] = sc.nextLine().charAt(0);
            if (generos[i] == 'F' || generos[i] == 'f') {
                contF = contF + 1;
            } else if (generos[i] == 'M' || generos[i] == 'm') {
                contM = contM + 1;
            }
        }

        menorAltura = alturas[0];
        maiorAltura = alturas[0];

        for (i = 1; i < N; i++) {
            if (menorAltura > alturas[i]) {
                menorAltura = alturas[i];
            } else if (maiorAltura < alturas[i]) {
                maiorAltura = alturas[i];
            }
        }

        somaAlturaM = 0;
        somaAlturaF = 0;

        for (i = 0; i < N; i++) {
            if (generos[i] == 'F' || generos[i] == 'f') {
                somaAlturaF = somaAlturaF + alturas[i];
            } else if (generos[i] == 'M' || generos[i] == 'm') {
                somaAlturaM = somaAlturaM + alturas[i];
            }
        }

        mediaAlturaM = somaAlturaM / contM;
        mediaAlturaF = somaAlturaF / contF;

        System.out.println();
        System.out.println("* Maior Altura Geral: " + String.format("%.2f", maiorAltura));
        System.out.println("* Menor Altura Geral: " + String.format("%.2f", menorAltura));
        System.out.println("* Quantidade de Homens: " + contM);
        System.out.println("* Quantidade de Mulheres: " + contF);
        System.out.println("* Média de Altura dos Homens: " + String.format("%.2f", mediaAlturaM));
        System.out.println("* Média de Altura das Mulheres: " + String.format("%.2f", mediaAlturaF));

        sc.close();
    }
}
