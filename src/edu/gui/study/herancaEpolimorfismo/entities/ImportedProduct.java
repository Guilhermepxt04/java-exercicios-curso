package edu.gui.study.herancaEpolimorfismo.entities;

public final class ImportedProduct extends Product{

    private Double customsFee;

    public ImportedProduct() {}

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }


    @Override
    public final String priceTag() {

        return super.priceTag() + " (Customs fee: $ " + String.format("%.2f", customsFee) + ")";
    }

    public void totalPrice() {

        this.price += customsFee;

    }
}
