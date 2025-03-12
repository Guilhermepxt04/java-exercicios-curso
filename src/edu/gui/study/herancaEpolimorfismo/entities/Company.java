package edu.gui.study.herancaEpolimorfismo.entities;

public final class Company extends TaxPayer {

    private Integer numberEmployees;

    public Company() {
    }

    public Company(String name, Double annualIncome, Integer numberWorkers) {
        super(name, annualIncome);
        this.numberEmployees = numberWorkers;
    }

    @Override
    public final Double valorImposto() {
        if (numberEmployees > 10) {

            return (anualIncome * (14.0/100.0));
        }
        else return (anualIncome * (16.0/100.0));
    }
}
