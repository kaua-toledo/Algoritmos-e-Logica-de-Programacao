package exercicios.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class medidas {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B ,C, areaQuadrado, areaTriangulo, areaTrapezio;

        System.out.println("Informe o valor das medidas");
        System.out.print("Medida A: ");
        A = sc.nextInt();
        System.out.print("Medida B: ");
        B = sc.nextInt();
        System.out.print("Medida C: ");
        C = sc.nextInt();
        System.out.println();

        areaQuadrado = Math.pow(A, 2.0);
        areaTriangulo = (A * B) / 2.0;
        areaTrapezio = ((A + B) * C) / 2.0;

        System.out.println("Área do Quadrado: " + String.format("%.4f", areaQuadrado));
        System.out.println("Área do Triângulo: " + String.format("%.4f", areaTriangulo));
        System.out.println("Área do Trapézio: " + String.format("%.4f", areaTrapezio));

    }
}
