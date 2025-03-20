package edu.gui.study.excecoes.app;

import edu.gui.study.excecoes.model.entities.Account;
import edu.gui.study.excecoes.model.exception.DomainAccountException;

import java.util.Locale;
import java.util.Scanner;

public class Bank {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);

        try {

            System.out.println("Enter account data");

            System.out.print("Number: ");
            Integer number = sc.nextInt();

            System.out.print("Holder: ");
            sc.nextLine();
            String holder = sc.nextLine();

            System.out.print("Initial balance: ");
            Double initialBalance = sc.nextDouble();

            System.out.print("Withdraw limit: ");
            Double withDrawLimit = sc.nextDouble();

            Account account = new Account(number, holder, initialBalance, withDrawLimit);

            System.out.print("Enter amount for withdraw: ");
            Double withDraw = sc.nextDouble();

            account.withdraw(withDraw);
        } catch (DomainAccountException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } finally {
            sc.close();
        }

    }

}
