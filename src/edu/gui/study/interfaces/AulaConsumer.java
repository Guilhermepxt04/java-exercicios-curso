package edu.gui.study.interfaces;

import edu.gui.study.interfaces.model.entities.Product;
import edu.gui.study.interfaces.model.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class AulaConsumer {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Tv", 50.00));
        list.add(new Product("Tv", 350.00));
        list.add(new Product("Tv", 80.90));


        double factor = 1.1;
        Consumer<Product> cons =  p -> p.setPrice(p.getPrice() * factor);

        // list.forEach(new PriceUpdate()); soluçao com implementação de interface
        // list.forEach(Product::staticPriceUpdate); solução com method reference
        // list.forEach(product -> product.setPrice(product.getPrice() * 1.1)); usando lambda inline
        // list.forEach(cons); solução com lambda declarada
        list.forEach((Product::nonStaticPriceUpdate)); // solucção com methdo reference instanciada

        list.forEach(System.out::println); // usando reference method para a função println do objeto system.out


    }
}