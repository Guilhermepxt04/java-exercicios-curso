package edu.gui.study.herancaEpolimorfismo.entities;

public final class Individual extends TaxPayer {

    private Double healthExpenditure;

    public Individual() {}

    public Individual(String name, Double annualIncome, Double healthExpenditure) {
        super(name, annualIncome);
        this.healthExpenditure = healthExpenditure;
    }

    @Override
    public final Double valorImposto() {
        if (anualIncome < 20000.00) {

            return (anualIncome * (15.0/100.0)) - (healthExpenditure * (50.0/100.0));

        } else return (anualIncome * (25.0/100.0) - (healthExpenditure * (50.0/100.0)));
    }
}
