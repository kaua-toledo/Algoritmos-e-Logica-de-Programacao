package exercicios.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class bhaskara {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C, Delta, x1, x2;

        System.out.println("* Informe os valores para o cálculo de Bhaskara *");
        System.out.print("Coeficiente A: ");
        A = sc.nextDouble();
        System.out.print("Coeficiente B: ");
        B = sc.nextDouble();
        System.out.print("Coeficiente C: ");
        C = sc.nextDouble();
        System.out.println();
        // Calculo de Delta
        Delta = (Math.pow(B, 2)) - (4 * A * C);
        // Verificação de raízes
        if (A == 0 || Delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else {
            x1 = (-B + Math.sqrt(Delta)) / (2.0 * A);
            x2 = (-B - Math.sqrt(Delta)) / (2.0 * A);
            System.out.println("* Resultado Final: (" + String.format("%.2f", x1) + ", " + String.format("%.2f", x2) + ")");
        }
        sc.close();
    }
}
