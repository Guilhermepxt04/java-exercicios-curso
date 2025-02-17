package edu.gui.study.variables;

import java.util.Scanner;

public class EX01 {

    public static void main(String[] args) {

        int x, y, r;

        Scanner sc = new Scanner(System.in);

        x = sc.nextInt();
        y = sc.nextInt();

        r = x + y;

        System.out.printf("SOMA = %d%n", r);

        sc.close();
    }
}
