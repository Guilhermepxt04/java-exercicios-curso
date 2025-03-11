package edu.gui.study.herancaEpolimorfismo.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product {

    private LocalDate manuFactureDate;

    public UsedProduct(String name, Double price, LocalDate manuFactureDate) {
        super(name, price);
        this.manuFactureDate = manuFactureDate;
    }

    @Override
    public final String priceTag() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String formattedDate = manuFactureDate.format(formatter);

        return this.name + " (used) " +
                " $ " + this.price +
                " (Manufacture date: " + formattedDate + ")";
    }
}
