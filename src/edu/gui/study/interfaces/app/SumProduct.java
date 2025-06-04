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

        double sum = ProductService.filteredSum(list, product -> product.getPrice() < 100.0); //usando uma função como parametro para
        // filtrar a lista e não precisar acessar meu service para isso

        System.out.printf("Sum: %.2f", sum);


    }
}
