package exercicios.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class dardo {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double distancia1, distancia2, distancia3, maiorDist;

        System.out.println("* Arremesso de dardos *");
        System.out.println("Digite a distância dos três lançamentos:");
        distancia1 = sc.nextDouble();
        distancia2 = sc.nextDouble();
        distancia3 = sc.nextDouble();

        if (distancia1 > distancia2 && distancia1 > distancia3) {
            maiorDist = distancia1;
        } else if (distancia2 > distancia3) {
            maiorDist = distancia2;
        } else {
            maiorDist = distancia3;
        }
        System.out.println("* Maior distância: " + String.format("%.1f", maiorDist));
        sc.close();
    }
}
