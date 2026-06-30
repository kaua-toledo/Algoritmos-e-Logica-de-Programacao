package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

public class pares_consecutivos {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, soma;

        System.out.print("Digite um número inteiro: ");
        X = sc.nextInt();

        while (X != 0) {
            if (X % 2 != 0) {
                X = X + 1;
            }
            soma = 5 * X + 20;
            System.out.println("* Pares consecutivos: " + X + " + " + (X+2) + " + "
                               + (X+4) + " + " + (X+6) + " + " + (X+8) + " = " + soma);

            System.out.print("Digite um número inteiro: ");
            X = sc.nextInt();
        }

        sc.close();
    }
}
