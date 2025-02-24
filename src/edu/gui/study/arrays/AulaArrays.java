package edu.gui.study.arrays;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Locale;
import edu.gui.study.poo.entities.Product;

public class AulaArrays {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Product[] vect = new Product[n];


        for (int i=0; i<vect.length; i++) {

            sc.nextLine();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Product(name, price);
        }

        double sum = 0.0;
        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }

        System.out.println(Arrays.toString(vect));

        double average = sum / n;
        System.out.printf("AVERAGE PRICE = %.2f%n", average);

        // double averageHeight = totalHeight / n;
        // System.out.println("AVERAGE HEIGHT: " + String.format("%.2f%n", averageHeight));

        sc.close();
    }

}
