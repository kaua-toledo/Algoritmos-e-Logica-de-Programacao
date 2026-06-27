package exercicios.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class aumento_salarial {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salario, novo_salario, aumento;
        int porcentagem = 0;

        System.out.print("Digite o salário da pessoa: ");
        salario = sc.nextDouble();

        if (salario <= 1000) {
            porcentagem = 20;
        } else if (salario <= 3000) {
            porcentagem = 15;
        } else if (salario <= 8000) {
            porcentagem = 10;
        } else {
            porcentagem = 5;
        }

        aumento = (salario * porcentagem) / 100;
        novo_salario = salario + aumento;

        System.out.println("* Novo Salário: $" + String.format("%.2f", novo_salario));
        System.out.println("* Porcentagem: " + porcentagem + "%");
        System.out.println("* Aumento: $" + String.format("%.2f", aumento));

        sc.close();
    }
}
