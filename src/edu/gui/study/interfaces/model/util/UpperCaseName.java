package edu.gui.study.interfaces.model.util;

import edu.gui.study.interfaces.model.entities.Product;

import java.util.function.Function;

public class UpperCaseName implements Function<Product, String> {


    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }

}
