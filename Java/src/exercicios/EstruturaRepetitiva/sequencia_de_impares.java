package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

public class sequencia_de_impares {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        System.out.print("Digite um número: ");
        x = sc.nextInt();
        System.out.println("Sequência de Ímpares de 1 a " + x);

        for (int i = 1; i <= x; i++) {
            if (i % 2 != 0) {
                System.out.println("> " + i);
            }
        }

        sc.close();
    }
}