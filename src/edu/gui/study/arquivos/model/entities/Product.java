package edu.gui.study.arquivos.model.entities;

public class Product {

    private String name;
    private Double price;
    private Integer quantity;

    public Product(String name, Double price, Integer quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public Double totalPrice() {

        return this.price + this.quantity;

    }

    @Override
    public String toString() {
        return  name + "," +
                String.format("%.2f", price) + "," +
                quantity;
    }
}
