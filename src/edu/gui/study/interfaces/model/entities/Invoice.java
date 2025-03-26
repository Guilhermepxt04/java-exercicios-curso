package edu.gui.study.interfaces.model.entities;

public class Invoice {

    private Double basicPayments;
    private Double tax;

    public Invoice() {
    }

    public Invoice(Double basicPayments, Double tax) {
        this.basicPayments = basicPayments;
        this.tax = tax;
    }


    public Double getBasicPayments() {
        return basicPayments;
    }

    public Double getTax() {
        return tax;
    }

    public Double getTotalPayment() {
        return this.basicPayments + this.tax;
    }
}
