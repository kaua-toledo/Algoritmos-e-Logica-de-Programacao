package exercicios.EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class validacao_de_notas {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, media;

        System.out.print("Digite sua primeira nota: ");
        nota1 = sc.nextDouble();
        while (nota1 < 0 || nota1 > 10) {
            System.out.println("Valor inválido! Tente novamente...");
            System.out.print("> ");
            nota1 = sc.nextDouble();
        }

        System.out.print("Digite sua segunda nota: ");
        nota2 = sc.nextDouble();
        while (nota2 < 0 || nota2 > 10) {
            System.out.println("Valor inválido! Tente novamente...");
            System.out.print("> ");
            nota2 = sc.nextDouble();
        }

        media = (nota1 + nota2) / 2;
        System.out.println("Sua média é de " + String.format("%.1f", media));

        sc.close();
    }
}
