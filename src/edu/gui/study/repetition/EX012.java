package edu.gui.study.repetition;

import java.util.Scanner;

public class EX012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x, y;

        x = 999;
        y = 999;

        while (x != 0 & y != 0) {

            x = sc.nextInt();
            y = sc.nextInt();

            if (x > 0 & y > 0) {

                System.out.println("Primeiro");

            } else if (x > 0 & y < 0) {

                System.out.println("Quarto");

            } else if (x < 0 & y < 0) {

                System.out.println("Terceiro");

            } else if (x < 0 & y > 0) {

                System.out.println("Segundo");

            }

        }
    }

}
