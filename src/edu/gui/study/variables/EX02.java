package edu.gui.study.variables;

import java.util.Scanner;

public class EX02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double x, pi, x2;

        pi = 3.14159;

        x = sc.nextDouble();

        x2 = Math.pow(x, 2);


        System.out.println("A=" + pi * x2);


        sc.close();
    }

}
