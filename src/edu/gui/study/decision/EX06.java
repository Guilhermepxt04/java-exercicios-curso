package edu.gui.study.decision;

import java.util.Scanner;

public class EX06 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x;

        x = sc.nextInt();

        if (x >= 0) {
            System.out.println("NAO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }

        sc.close();
    }
}
