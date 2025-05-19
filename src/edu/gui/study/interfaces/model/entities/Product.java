package edu.gui.study.interfaces.model.entities;

public class Product {

    String name;
    Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean staticProductPredicate (Product p) {
        return p.getPrice() >= 100.00;
    }

    public boolean nonStaticProductPredicate () {
        return price >= 100.00;
    }

    public static void staticPriceUpdate (Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    public void nonStaticPriceUpdate () {
        price = price * 1.1;
    }

    public static String staticNameUpper(Product p) {
        return p.getName().toUpperCase();
    }

    public static String nonstaticNameUpper(Product p) {
        return p.getName().toUpperCase();
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", price=" + String.format("%.2f", price);
    }
}

