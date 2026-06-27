package exercicios.EstruturaCondicional;

import java.util.Scanner;

public class menor_de_tres {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1, n2, n3, menor;

        System.out.print("Primeiro número: ");
        n1 = sc.nextInt();
        System.out.print("Segundo número: ");
        n2 = sc.nextInt();
        System.out.print("Terceiro número: ");
        n3 = sc.nextInt();

        if (n1 < n2 && n1 < n3) {
            menor = n1;
        } else if (n2 < n3) {
            menor = n2;
        } else {
            menor = n3;
        }

        System.out.println("* O menor número é " + menor + ".");

        sc.close();
    }
}
