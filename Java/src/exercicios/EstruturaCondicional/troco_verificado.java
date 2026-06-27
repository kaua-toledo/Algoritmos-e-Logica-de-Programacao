package exercicios.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class troco_verificado {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double precoUni, pagamento, total, troco, resto;
        int quant;

        System.out.println("* Informe os Valores *");
        System.out.print("Preço unitário do produto: $");
        precoUni = sc.nextDouble();
        System.out.print("Quantidade: ");
        quant = sc.nextInt();
        System.out.print("Dinheiro recebido: $");
        pagamento = sc.nextDouble();

        total = precoUni * quant;

        if (pagamento >= total) {
            troco = pagamento - total;
            System.out.println("Troco: $" + String.format("%.2f", troco));
        } else {
            resto = total - pagamento;
            System.out.println("Dinheiro insuficiente. Faltam $" + String.format("%.2f", resto));
        }
        sc.close();
    }
}
