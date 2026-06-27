package exercicios.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class notas {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double nota1, nota2, notaFinal;

        System.out.println("* Conferir Nota Final *");
        System.out.print("Digite sua nota do primeiro semestre: ");
        nota1 = sc.nextDouble();
        System.out.print("Digite sua nota do segundo semestre: ");
        nota2 = sc.nextDouble();

        notaFinal = nota1 + nota2;

        if (notaFinal >= 60) {
            System.out.println("Parabéns, você foi aprovado!");
        } else {
            System.out.println("Infelizmente, você foi reprovado.");
        }
        sc.close();
    }
}
