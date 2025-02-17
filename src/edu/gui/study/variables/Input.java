package edu.gui.study.variables;

import java.util.Locale;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        int y;
        double z;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();

        Locale.setDefault(Locale.US);

        System.out.println("Dados digitados: ");
        System.out.println(" ");

        System.out.printf("%s%n", x);
        System.out.printf("%d%n", y);
        System.out.printf("%.2f%n", z);

        sc.close();
    }
}
