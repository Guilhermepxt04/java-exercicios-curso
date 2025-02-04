package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;

public class Bank {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String nameAccount = sc.nextLine();

        System.out.print("Is there na initial deposit (y/n)?: ");
        char response = sc.next().charAt(0);

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double balance = sc.nextDouble();
            account = new Account(numberAccount, nameAccount, balance);
        }

        else {
            account = new Account(numberAccount, nameAccount);
        }

        System.out.println("ACCOUNT DATA: ");
        System.out.println(account);

        System.out.println(" ");

        System.out.print("Enter a deposit value: ");
        double deposit = sc.nextDouble();
        account.deposit(deposit);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.println(" ");

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        account.withdraw(withdraw);
        System.out.println("Updated account data: ");
        System.out.println(account);
    }

}
