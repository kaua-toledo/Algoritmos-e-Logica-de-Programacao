package exercicios.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class retangulo {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double area, diagonal, perimetro, altura, base;

        System.out.print("Base do retângulo: ");
        base = sc.nextDouble();
        System.out.print("Altura do Retângulo: ");
        altura = sc.nextDouble();

        area = base * altura;
        diagonal = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
        perimetro = 2 * (base + altura);

        System.out.println("* Área = " + String.format("%.4f", area));
        System.out.println("* Perímetro = " + String.format("%.4f", perimetro));
        System.out.println("* Diagonal = " + String.format("%.4f", diagonal));


        sc.close();
    }
}
