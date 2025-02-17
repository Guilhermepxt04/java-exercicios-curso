package edu.gui.study.repetition;

import java.util.Scanner;

public class EX014 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int fora = 0, dentro = 0;

        for (int i=0; i<N; i++) {

            int x = sc.nextInt();

            if (x >= 10 & x <= 20 ) {

                dentro += 1;

            }
            else {

                fora += 1;

            }
        }

        System.out.printf("%d in %n", dentro);
        System.out.printf("%d out", fora);

        sc.close();
    }

}
