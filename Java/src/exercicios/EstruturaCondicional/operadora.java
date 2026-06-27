package exercicios.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class operadora {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int minutos;
        double valor;

        System.out.println("* Serviço de Telefone *");
        System.out.print("Digite a quantidade de minutos: ");
        minutos = sc.nextInt();
        valor = 50.00;

        if (minutos > 100) {
            valor = (minutos - 100) * 2 + valor;
        }

        System.out.println("Valor a ser cobrado: R$ " + String.format("%.2f", valor));
        sc.close();
    }
}
