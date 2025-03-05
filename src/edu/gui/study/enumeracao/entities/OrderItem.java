package edu.gui.study.enumeracao.entities;


import java.util.ArrayList;
import java.util.List;

public class OrderItem {

    private Integer quantity;
    private Double price;
    private String productName;

    public OrderItem() {}

    public OrderItem(String ProductName, Integer quantity, Double price) {
        this.productName = ProductName;
        this.quantity = quantity;
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }


    public Double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }


    public Double subTotal() {
        return quantity * price ;
    }
}
