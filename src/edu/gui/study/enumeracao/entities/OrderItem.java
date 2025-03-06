package edu.gui.study.enumeracao.entities;


public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem() {}

    public OrderItem(Product product, Integer quantity, Double price) {
        this.product = product;
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
        return product.getName();
    }


    public Double subTotal() {
        return quantity * price ;
    }
}
