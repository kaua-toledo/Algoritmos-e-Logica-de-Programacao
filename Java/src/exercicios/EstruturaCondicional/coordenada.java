package exercicios.EstruturaCondicional;

import java.util.Scanner;

public class coordenada {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y;
        String origem;

        System.out.print("Valor de X: ");
        x = sc.nextInt();
        System.out.print("Valor de Y: ");
        y = sc.nextInt();

        if (x > 0 && y > 0) {
            origem = "1° Quadrante";
        } else if (x < 0 && y > 0) {
            origem = "2° Quadrante";
        } else if (x < 0 && y < 0) {
            origem = "3° Quadrante";
        } else if (x > 0 && y < 0) {
            origem = "4° Quadrante";
        } else if (x > 0 && y == 0) {
            origem = "Eixo X";
        } else if (x == 0 && y > 0) {
            origem = "Eixo Y";
        } else {
            origem = "Origem";
        }

        System.out.println("* Posição: " + origem);

        sc.close();
    }
}
