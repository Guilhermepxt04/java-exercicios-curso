package edu.gui.study.interfaces.model.util;

import edu.gui.study.interfaces.model.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
