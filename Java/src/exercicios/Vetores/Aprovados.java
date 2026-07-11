package exercicios.Vetores;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int N, i;
        double MediaFinal;
        String[] Alunos = new String[9];
        double[] PrimeiroSemestre = new double[9], SegundoSemestre = new double[9];

        do {
            System.out.println("Quantos alunos serão digitados? (Máx. 10) ");
            System.out.print("> ");
            N = sc.nextInt();
        } while (N < 1 || N > 10);

        System.out.println();
        for (i = 0; i < N; i++) {
            System.out.print("Aluno: ");
            sc.nextLine();
            Alunos[i] = sc.nextLine();
            System.out.print("Nota do Primeiro Semestre: ");
            PrimeiroSemestre[i] = sc.nextDouble();
            System.out.print("Nota do Segundo Semestre: ");
            SegundoSemestre[i] = sc.nextDouble();
        }

        MediaFinal = 0;

        System.out.println();
        System.out.println("* Alunos aprovados");
        for (i = 0; i < N; i++) {
            MediaFinal = (PrimeiroSemestre[i] + SegundoSemestre[i]) / 2.0;
            if (MediaFinal >= 6.0) {
                System.out.println(Alunos[i] + ": " + String.format("%.1f", MediaFinal));
            }
        }

        sc.close();
    }
}
