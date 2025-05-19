package edu.gui.study.interfaces;

import edu.gui.study.interfaces.model.entities.Product;
import edu.gui.study.interfaces.model.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AulaFunction {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Notebook", 50.00));
        list.add(new Product("Tablet", 350.00));
        list.add(new Product("Hd Case", 80.90));

        Function<Product, String> fun = product -> product.getName().toUpperCase();

        // List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList()); solução com interface em outra classe
        //List<String> names = list.stream().map(Product::staticNameUpper).collect(Collectors.toList()); Solução com reference method
        // List<String> names = list.stream().map(Product::nonstaticNameUpper).collect(Collectors.toList()); Solução com reference methdo
        // não estatic
        //List<String> names = list.stream().map(fun).collect(Collectors.toList()); Solução com lamba declarada
        List<String> names = list.stream().map(product -> product.getName().toUpperCase()).collect(Collectors.toList()); //solução com
        // lambda inline





        list.forEach(System.out::println);
        System.out.println('-'*30);
        names.forEach(System.out::println);
    }
}
