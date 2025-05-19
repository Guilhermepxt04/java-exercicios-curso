package edu.gui.study.interfaces.app;

import edu.gui.study.interfaces.model.entities.Product;
import edu.gui.study.interfaces.model.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SumProduct {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();


        list.add(new Product("Tv", 900.00));
        list.add(new Product("Notebook", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("Hd Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list, product -> product.getName().charAt(0) == 'N');

        System.out.printf("Sum: %.2f", sum);


    }
}
