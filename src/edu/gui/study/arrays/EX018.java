package edu.gui.study.arrays;

import java.util.Scanner;

public class EX018 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n;

        do {
            System.out.print("Quantos numeros voce vai digitar(de 0 a 10): ");
            n = sc.nextInt();
        } while (n > 10 || n < 0);

        int[] vect = new int[n];

        for (int i=0; i<vect.length; i++) {

            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();

        }

        System.out.println("NUMEROS NEGATIVOS: ");

        for (int j : vect) {

            if (j < 0) {

                System.out.println(j);

            }

        }

        sc.close();
    }

}


