package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

public class quadrantes {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String origem;
        int x, y;

        System.out.println("Digite os valores das coordenadas X e Y.");
        System.out.print("X: ");
        x = sc.nextInt();
        System.out.print("Y: ");
        y = sc.nextInt();

        while (x != 0 && y != 0) {
            if (x > 0 && y > 0) {
                origem = "1° Quadrante";
            } else if (x < 0 && y > 0) {
                origem = "2° Quadrante";
            } else if (x < 0 && y < 0) {
                origem = "3° Quadrante";
            } else {
                origem = "4° Quadrante";
            }
            System.out.println(origem);
            System.out.print("X: ");
            x = sc.nextInt();
            System.out.print("Y: ");
            y = sc.nextInt();
        }

        sc.close();
    }
}
