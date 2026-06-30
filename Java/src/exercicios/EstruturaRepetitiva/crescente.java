package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

public class crescente {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;

        System.out.println("Digite dois números:");
        x = sc.nextInt();
        y = sc.nextInt();

        while (x != y) {
            if (x > y) {
                System.out.println("Os números estão em ordem decrescente!");
            } else {
                System.out.println("Os números estão em ordem crescente!");
            }
            System.out.print("Digite outros dois números:");
            x = sc.nextInt();
            y = sc.nextInt();
        }

        sc.close();
    }
}