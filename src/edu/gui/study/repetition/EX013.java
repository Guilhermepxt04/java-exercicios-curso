package edu.gui.study.repetition;

import java.util.Scanner;

public class EX013 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i=0; i<=x; i++) {

            int r = i % 2;

            if (r == 1) {

                System.out.println(i);

            }

        }

        sc.close();

    }
}
