package exercicios.EstruturaCondicional;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class lanchonete {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quant;
        double valorTotal = 0;

        System.out.println("* Tabela de Produtos *");
        System.out.println("1. Suco");
        System.out.println("2. Milk-shake");
        System.out.println("3. Refrigerante");
        System.out.println("4. Cheeseburger");
        System.out.println("5. Porção de batata");
        System.out.print("Digite o código do produto comprado: ");
        codigo = sc.nextInt();
        System.out.print("Quantidade: ");
        quant = sc.nextInt();

        switch (codigo) {
            case 1:
                valorTotal = 5.00 * quant;
                break;
            case 2:
                valorTotal = 4.80 * quant;
                break;
            case 3:
                valorTotal = 3.50 * quant;
                break;
            case 4:
                valorTotal = 8.90 * quant;
                break;
            case 5:
                valorTotal = 7.32 * quant;
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        if (codigo >= 1 && codigo <= 5) {
            System.out.println("Valor a pagar: $" + String.format("%.2f", valorTotal));
        }
        sc.close();
    }
}
