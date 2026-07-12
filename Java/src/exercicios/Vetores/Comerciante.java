package exercicios.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Comerciante {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i, Abaixo = 0, Entre = 0, Acima = 0;
        double Percentual, Lucro, TotalLucro = 0, TotalCompra = 0, TotalVenda = 0;


        System.out.print("Quantos produtos serão digitados? ");
        N = sc.nextInt();

        char[] Produtos = new char[N];
        double[] PrecoDeCompra = new double[N];
        double[] PrecoDeVenda = new double[N];

        for (i = 0; i < N; i++) {
            System.out.println((i + 1) + "º Produto");
            System.out.print("Nome: ");
            sc.nextLine();
            Produtos[i] = sc.nextLine().charAt(0);
            System.out.print("Preço de Compra: ");
            PrecoDeCompra[i] = sc.nextDouble();
            System.out.print("Preço de Venda: ");
            PrecoDeVenda[i] = sc.nextDouble();
        }
        System.out.println();


        for (i = 0; i < N; i++) {
            Lucro = PrecoDeVenda[i] - PrecoDeCompra[i];
            Percentual = Lucro * 100 / PrecoDeCompra[i];

            if (Percentual < 10) {
                Abaixo = Abaixo + 1;
            } else if (Percentual <= 20) {
                Entre = Entre + 1;
            } else {
                Acima = Acima + 1;
            }
        }

        for (i = 0; i < N; i++) {
            TotalCompra = TotalCompra + PrecoDeCompra[i];
            TotalVenda = TotalVenda + PrecoDeVenda[i];
            TotalLucro = TotalLucro + (PrecoDeVenda[i] - PrecoDeCompra[i]);
        }

        System.out.println("* Relatório Final");
        System.out.println("Lucro abaixo de 10%: " + Abaixo);
        System.out.println("Lucro entre 10% e 20%: " + Entre);
        System.out.println("Lucro acima de 20%: " + Acima);
        System.out.println("Total de Compras: R$ " + String.format("%.2f", TotalCompra));
        System.out.println("Total de Vendas: R$ " + String.format("%.2f", TotalVenda));
        System.out.println("Total de Lucro: R$ " + String.format("%.2f", TotalLucro));

        sc.close();
    }
}
