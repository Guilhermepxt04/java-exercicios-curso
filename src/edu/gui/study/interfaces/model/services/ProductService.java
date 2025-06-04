package edu.gui.study.interfaces.model.services;

import edu.gui.study.interfaces.model.entities.Product;

import java.util.List;
import java.util.function.Predicate;

public class ProductService {

    public static double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product p : list) {
            if (criteria.test(p)) {

                sum += p.getPrice();

            }
        }
        return sum;
    }
}
