package edu.gui.study.herancaEpolimorfismo.app;

import edu.gui.study.herancaEpolimorfismo.entities.TaxPayer;
import edu.gui.study.herancaEpolimorfismo.entities.Individual;
import edu.gui.study.herancaEpolimorfismo.entities.Company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Imposto {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        List<TaxPayer> taxPayers = new ArrayList<>();
        TaxPayer taxPayer;

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {

            System.out.printf("tax payer #%d data: %n", i + 1);
            System.out.print("Individual or company (i/c)? ");
            char c = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            Double anualIncome = sc.nextDouble();

            switch (c) {

                case 'i':
                    System.out.print("Healt expenditures: ");
                    Double healthExpenditures = sc.nextDouble();
                    taxPayer = new Individual(name, anualIncome, healthExpenditures);
                    taxPayers.add(taxPayer);
                    break;
                case 'c':
                    System.out.print("Number of employees: ");
                    Integer numberEmployees = sc.nextInt();
                    taxPayer = new Company(name, anualIncome, numberEmployees);
                    taxPayers.add(taxPayer);
            }
        }

        System.out.println("TAXES PAID: ");

        Double sumTaxes = 0.0;
        for (TaxPayer p : taxPayers) {

            System.out.printf("%s: $ %.2f%n", p.getName(), p.valorImposto());
            sumTaxes += p.valorImposto();
        }

        System.out.printf("TOTAL TAXES: %.2f%n", sumTaxes);

        sc.close();
    }
}
