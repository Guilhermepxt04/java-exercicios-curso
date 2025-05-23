package edu.gui.study.poo.app;

import java.util.Scanner;
import java.util.Locale;
import edu.gui.study.poo.entities.Triangle;

public class AreaTriangulos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle x,y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Enter the measures of triangle y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areax = x.area();
        double areay = x.area();

        System.out.printf("Triangle X area: %.4f%n", areax);
        System.out.printf("Triangle Y area: %.4f%n", areay);

        if (areax > areay) {

            System.out.println("Larger area: X");
        }
        else {

            System.out.println("Larger area: Y");

        }
        sc.close();
    }
}
