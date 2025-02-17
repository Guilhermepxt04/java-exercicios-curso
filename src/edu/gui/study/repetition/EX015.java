package edu.gui.study.repetition;

import java.util.Scanner;

public class EX015 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x = N;


        if (N > 0 ) {

            while (x > 1) {

                x -= 1;
                N *= x;

            }
            System.out.println(N);
        }
        else {

            System.out.println("1");

        }

        sc.close();
    }

}
