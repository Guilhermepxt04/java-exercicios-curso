package edu.gui.study.lambda;

import edu.gui.study.lambda.model.entities.Product;

import java.util.ArrayList;
import java.util.List;

public class AulaLambda {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 1200.00));
        products.add(new Product("Tablet", 900.00));
        products.add(new Product("Notebook", 1000.00));
        products.add(new Product("A", 2000.00));

        products.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for (Product p : products) {
            System.out.println(p);
        }
    }
}
