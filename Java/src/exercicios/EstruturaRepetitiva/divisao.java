package exercicios.EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class divisao {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numerador, denominador, N;
        double resultado;

        System.out.print("Quantos divisões você vai fazer? ");
        N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            System.out.print("Entre com o numerador: ");
            numerador = sc.nextInt();
            System.out.print("Entre com o denominador: ");
            denominador = sc.nextInt();
            if (denominador == 0) {
                System.out.println("A divisão é impossível.");
            } else {
                resultado = (double) numerador / denominador;
                System.out.println("* Resultado da divisão: " + String.format("%.2f", resultado));
            }
        }
        sc.close();
    }
}
