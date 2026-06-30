package exercicios.EstruturaRepetitiva;

import java.util.Scanner;

public class combustivel {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, gasolina = 0, diesel = 0, alcool = 0;

        System.out.println("Informe um código:");
        System.out.println("1. Gasolina");
        System.out.println("2. Diesel");
        System.out.println("3. Alcool");
        System.out.println("0. Sair");
        System.out.print("> ");
        codigo = sc.nextInt();

        while (codigo != 0) {
            switch (codigo) {
                case 1:
                    gasolina = gasolina + 1;
                    break;
                case 2:
                    diesel = diesel + 1;
                    break;
                case 3:
                    alcool = alcool + 1;
                    break;
            }
            System.out.print("> ");
            codigo = sc.nextInt();
        }

        System.out.println();
        System.out.println("Muito obrigado. Volte sempre!");
        System.out.println("Gasolina: " + gasolina + "L");
        System.out.println("Diesel: " + diesel + "L");
        System.out.println("Alcool: " + alcool + "L");
        sc.close();
    }
}
