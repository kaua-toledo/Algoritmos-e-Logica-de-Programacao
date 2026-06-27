package exercicios.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class glicose {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double glicose;
        String classificacao;

        System.out.print("Digite sua medida de glicose: ");
        glicose = sc.nextDouble();

        if (glicose <= 100) {
            classificacao = "Normal";
        } else if (glicose <= 140) {
            classificacao = "Elevado";
        } else {
            classificacao = "Diabetes";
        }
        System.out.println("Classificação: " + classificacao);
        sc.close();
    }
}
