package edu.gui.study.interfaces;

import edu.gui.study.interfaces.model.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AulaPredicate {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Tv", 50.00));
        list.add(new Product("Tv", 350.00));
        list.add(new Product("Tv", 80.90));

        Predicate<Product> pred = (p) -> p.getPrice() >= 100.00;

        // list.removeIf(p -> p.getPrice() >= 100); solução com lambda inline
        // list.removeIf(new ProductPredicate()); soluçao com implementação de interface
        // list.removeIf(Product::staticProductPredicate); solução com method reference
        // list.removeIf(Product::nonStaticProductPredicate); solução com method reference instanciado
        // list.removeIf(pred); solução com lambda declarada
        list.removeIf(pred);

        for (Product p : list) {
            System.out.println(p );
        }

    }
}
