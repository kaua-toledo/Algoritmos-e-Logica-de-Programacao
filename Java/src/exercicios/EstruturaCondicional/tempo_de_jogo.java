package exercicios.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class tempo_de_jogo {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int inicio, fim, duracao;

        System.out.println("* Calcular Tempo de Jogo");
        System.out.print("Hora inicial: ");
        inicio = sc.nextInt();
        System.out.print("Hora final: ");
        fim = sc.nextInt();

        if (fim > inicio) {
            duracao = fim - inicio;
        } else {
            duracao = (24 - inicio) + fim;
        }

        System.out.println("* Tempo de jogo: " + duracao + " hora(s)");

        sc.close();
    }
}
