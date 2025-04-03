package edu.gui.study.interfaces.app;

import edu.gui.study.interfaces.model.services.BrazilInterestService;
import edu.gui.study.interfaces.model.services.InterestService;
import java.util.Locale;
import java.util.Scanner;

public class ProgramLoanPayment {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        InterestService interestService = new BrazilInterestService(2.0);

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        double payment = interestService.payment(amount, months);

        System.out.println("Payment after " + months + " months: ");
        System.out.printf("%.2f%n", payment);


    }
}
