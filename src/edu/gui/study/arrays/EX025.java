package edu.gui.study.arrays;

import java.util.Locale;
import java.util.Scanner;

public class EX025 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas voce vai digitar?: ");
        int n = sc.nextInt();

        String[] vectName = new String[n];
        int[] vectAge = new int[n];
        String older = "";
        int indexOlder = 0;

        for (int i=0; i<n; i++) {

            System.out.printf("Dados da %da pessoa: %n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine();
            vectName[i] = sc.nextLine();
            System.out.print("Idade: ");
            vectAge[i] = sc.nextInt();

            if (vectAge[i] > indexOlder) {

                older = vectName[i];

            }


            indexOlder = vectAge[i];
        }

        System.out.println("PESSOA MAIS VELHA: " + older.toUpperCase());

        sc.close();
    }

}
