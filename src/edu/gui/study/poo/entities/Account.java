package edu.gui.study.poo.entities;

public class Account {

    // ATRIBUTOS
    private int numberAccount;
    private String nameAccount;
    private double initialDeposit;
    private double balance;

    // CONSTRUTORES
    public Account(int numberAccount, String nameAccount) {
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;

    }

    public Account(int numberAccount, String nameAccount, double balance) {
        this.numberAccount = numberAccount;
        this.nameAccount = nameAccount;
        this.balance = deposit(balance);
    }

    // GETTERS | SETTERS
    public void setNameAccount(String nameAccount) {
        this.nameAccount = nameAccount;
    }
    public int getNumberAccount(){
        return this.numberAccount;
    }

    // METODOS
    public double deposit(double deposit) {

        return balance += deposit;

    }

    public double withdraw(double withdraw) {

        withdraw += 5;
        return balance -= withdraw ;

    }


    public String toString(){

        return ("Account " + numberAccount + ", " +
                "Holder: " + nameAccount + ", " +
                "Balance: $ " + String.format("%.2f", balance));
    }



}
