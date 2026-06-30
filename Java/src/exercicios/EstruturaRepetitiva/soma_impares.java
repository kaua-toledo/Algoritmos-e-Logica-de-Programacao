package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

public class soma_impares {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X, Y, troca, soma = 0;

        System.out.println("Digite dois números:");
        System.out.print("> ");
        X = sc.nextInt();
        System.out.print("> ");
        Y = sc.nextInt();

        if (X > Y) {
            troca = X;
            X = Y;
            Y = troca;
        }

        for (int i = X+1; i < Y-1; i++) {
            if (i % 2 != 0) {
                soma = soma + i;
            }
        }
        System.out.println("* Soma dos números ímpares entre " + X + " e " + Y + ": " + soma);

        sc.close();
    }
}
