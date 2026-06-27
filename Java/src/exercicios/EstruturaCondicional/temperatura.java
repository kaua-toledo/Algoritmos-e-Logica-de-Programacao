package exercicios.EstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class temperatura {

    static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char medida;
        double tempC, tempF;

        System.out.print("Escolha a escala de temperatura (C/F): ");
        medida = sc.next().charAt(0);
        if (medida == 'C' || medida == 'c') {
            System.out.print("Digite a temperatura em Celsius: ");
            tempC = sc.nextDouble();
            tempF = tempC * 9.0 / 5.0 + 32;
            System.out.println("Temperatura equivalente em Fahrenheit: " + String.format("%.2f", tempF));
        } else if (medida == 'F' || medida == 'f') {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            tempF = sc.nextDouble();
            tempC = 5.0 / 9.0 * (tempF - 32.0);
            System.out.println("Temperatura equivalente em Celsius: " + String.format("%.2f", tempC));
        }
        sc.close();
    }
}
