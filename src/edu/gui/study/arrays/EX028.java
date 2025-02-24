package edu.gui.study.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EX028 {

    /**
     *
     * Neste exercicio deixei resolvido de duas formas por motivos de estudos sobre o tema de arrays e list
     *
     */

    public static void main(String [] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int quantidadeNegativos = 0;

        int[][] matriz = new int[n][n];
        List<Integer> mainDiagonal = new ArrayList<>();


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {

                matriz[i][j] = sc.nextInt();

                if (matriz[i][j] < 0 ) {
                    quantidadeNegativos += 1;
                }

                if (j == i) {
                    mainDiagonal.add(matriz[i][j]);
                }
            }
        }

        for (int[] numero : matriz) {
            System.out.println(" ");
            for (int j = 0; j < numero.length; j++) {

                System.out.print(numero[j] + " ");
            }
        }

        System.out.println(" ");

        System.out.println("Main diagonal: ");
        for (int i=0; i<matriz.length; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println(" ");
        // System.out.println(mainDiagonal);

        System.out.println("Negative numbers = " + quantidadeNegativos);



        sc.close();
    }

}
