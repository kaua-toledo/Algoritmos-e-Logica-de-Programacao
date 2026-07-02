package exercicios.EstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class experiencias {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, qtd, ratos = 0, coelhos = 0, sapos = 0, total = 0;
        double porcentoR, porcentoC, porcentoS;
        char cobaia;

        System.out.print("Quantos casos de testes serão digitados? ");
        N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("* CASO " + (i + 1) + " *");
            System.out.print("Quantidade de cobaias: ");
            qtd = sc.nextInt();
            System.out.println("Tipo de Cobaia:");
            System.out.println("R - Rato");
            System.out.println("C - Coelho");
            System.out.println("S - Sapo");
            System.out.print("> ");
            cobaia = sc.next().charAt(0);

            switch (cobaia) {
                case 'R':
                    ratos = qtd + ratos;
                    break;
                case 'S':
                    sapos = qtd + sapos;
                    break;
                case 'C':
                    coelhos = qtd + coelhos;
                    break;
            }
        }

        total = coelhos + ratos + sapos;
        porcentoR = ((double) ratos / total) * 100;
        porcentoC = ((double) coelhos / total) * 100;
        porcentoS = ((double) sapos / total) * 100;

        System.out.println("* Relatório final");
        System.out.println("Total de Cobaias: " + total);
        System.out.println("Ratos: " + ratos);
        System.out.println("Sapos: " + sapos);
        System.out.println("Coelhos: " + coelhos);
        System.out.println("Percentual de Ratos: " + String.format("%.2f", porcentoR));
        System.out.println("Percentual de Sapos: " + String.format("%.2f", porcentoS));
        System.out.println("Percentual de Coelhos: " + String.format("%.2f", porcentoC));
        sc.close();
    }
}