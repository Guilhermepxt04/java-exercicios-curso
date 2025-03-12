package edu.gui.study.herancaEpolimorfismo.entities;

public abstract class TaxPayer {

    protected String name;
    protected Double anualIncome;

    public TaxPayer() {};

    public TaxPayer(String name, Double anualIncome) {
        this.name = name;
        this.anualIncome = anualIncome;
    }

    public String getName() {
        return name;
    }

    public abstract Double valorImposto();
}
