package exercicios;

import java.util.Scanner;

public class EstruturaCondicional {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.print("Digite uma hora do dia: ");
        hora = sc.nextInt();

        if (hora > 18) {
            System.out.print("Boa noite!");
        } else if (hora < 12) {
            System.out.print("Bom dia!");
        } else {
            System.out.print("Boa tarde!");
        }
        sc.close();
    }
}
