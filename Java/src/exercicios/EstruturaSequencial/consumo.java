package exercicios.EstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class consumo {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double combustivel, distancia, consumo_medio;

        System.out.print("Distância percorrida: ");
        distancia = sc.nextDouble();
        System.out.print("Combustível gasto: ");
        combustivel = sc.nextDouble();
        consumo_medio = distancia / combustivel;
        System.out.println("* Consumo médio: " + String.format("%.3f", consumo_medio));

        sc.close();
    }
}