package edu.gui.study.excecoes.model.entities;

import edu.gui.study.excecoes.model.exception.DomainAccountException;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount)  {


    }

    public void withdraw(Double amount) {
        validateWithdrawl(amount);
        this.balance -= amount;
        System.out.println("New balance: " + String.format("%.2f", this.balance));

    }

    private void validateWithdrawl(Double amount) throws DomainAccountException {
        if (amount <= 0) {
            throw new DomainAccountException("Withdrawl amount must be positive");
        }
        if (amount > this.balance) {
            throw new DomainAccountException("Not enough balance");
        }
        if (amount > this.withdrawLimit) {
            throw new DomainAccountException("The amount exceeds withdraw limit");
        }
    }
}
