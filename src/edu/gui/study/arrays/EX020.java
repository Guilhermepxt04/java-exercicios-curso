package edu.gui.study.arrays;

import java.util.Locale;
import java.util.Scanner;

public class EX020 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar?: ");
        int n = sc.nextInt();
        int[] vect = new int[n];
        int quantityPar = 0;

        for (int i=0; i<vect.length; i++) {

            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NUMEROS PARES: ");

        for (int j : vect) {

            if (j % 2 == 0) {

                System.out.print(" ");
                System.out.print(j);
                quantityPar += 1;
            }
        }

        System.out.println(" ");
        System.out.println("QUANTIDADE DE PARES = " + quantityPar);

        sc.close();
    }

}
