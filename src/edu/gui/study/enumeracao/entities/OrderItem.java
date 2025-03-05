package edu.gui.study.enumeracao.entities;


import java.util.ArrayList;
import java.util.List;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private List<Product> products = new ArrayList<>();

    public OrderItem() {}

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }


    public Double getPrice() {
        return price;
    }


    public List<Product> getProducts() {
        return products;
    }

    public Double subTotal() {
        return quantity * price ;
    }

    public void addProduct(Product product) {
        products.add(product);
    }


}
