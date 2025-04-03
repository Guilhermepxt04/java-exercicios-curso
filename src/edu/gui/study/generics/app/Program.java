package edu.gui.study.generics.app;

import edu.gui.study.generics.model.services.PrintService;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PrintService<Integer> printService = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {
            printService.addValue(sc.nextInt());
        }

        printService.print();

        System.out.print("First Number: " + printService.first());

        sc.close();
    }
}
