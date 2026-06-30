package exercicios.EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class media_de_idades {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int idade, soma = 0, cont = 0;
        double media;

        System.out.println("Digite as idades: ");
        System.out.print("> ");
        idade = sc.nextInt();

        if (idade <= 0) {
            System.out.println("Impossível calcular.");
        }

        while (idade > 0) {
            soma = soma + idade;
            cont = cont + 1;
            System.out.print("> ");
            idade = sc.nextInt();
        }

        media = soma / cont;

        if (idade <= 0) {
            System.out.println("Média de Idades: " + String.format("%.1f", media));
        }

        sc.close();
    }
}
