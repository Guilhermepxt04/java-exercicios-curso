package edu.gui.study.poo.entities;

public class Product {

    private String name;
    private double price;
    private int quantity;


    public Product() {
    }

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice(){
        return this.price;
    }

    public int getQuantity(){
        return this.quantity;
    }

    public double totalValueInStock() {

        return price * quantity;

    }

    public int addProducts(int quantity) {

        return this.quantity += quantity;

    }

    public int removeProducts(int quantity) {

        return this.quantity -= quantity;

    }

    @Override
    public String toString() {
        return ("Product data: " + name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock()));
    }


}
