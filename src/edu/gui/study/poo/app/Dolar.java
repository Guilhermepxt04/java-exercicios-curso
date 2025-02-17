package edu.gui.study.poo.app;

import java.util.Locale;
import java.util.Scanner;
import edu.gui.study.poo.util.CurrencyConverter;


public class Dolar {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        double price = sc.nextDouble();

        System.out.print("How many dollars will be bought?: ");
        double many = sc.nextDouble();;

        CurrencyConverter.Quantity(price, many);
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.Converter());

        sc.close();
    }

}
