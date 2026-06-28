package exercicios.EstruturaSequencial;

import java.util.Scanner;

public class duracao {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int horas, minutos, segundos, resto, duracao;

        System.out.print("Digite a duração de tempo em segundos: ");
        duracao = sc.nextInt();

        horas = duracao / 3600;
        resto = duracao % 3600;
        minutos = resto / 60;
        segundos = resto % 60;

        System.out.println("A duração foi de " + horas + ":" + minutos + ":" + segundos);
    }
}
