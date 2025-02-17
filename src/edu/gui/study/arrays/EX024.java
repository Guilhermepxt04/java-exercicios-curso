package edu.gui.study.arrays;

import java.util.Locale;
import java.util.Scanner;

public class EX024 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter um vetor?: ");

        int n = sc.nextInt();
        double[] vect = new double[n];
        int sumPar = 0;
        int quantityPar = 0;


        for (int i=0; i<vect.length; i++) {

            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

            if (vect[i] % 2 == 0) {

                sumPar += (int) vect[i];
                quantityPar += 1;

            }
        }

        if (quantityPar > 0) {
            System.out.println("MEDIA DOS PARES = " + String.format("%.1f", (double) sumPar / quantityPar));
        }
        else {
            System.out.println("NENHUM NUMERO PAR");
        }

        sc.close();
    }

}
