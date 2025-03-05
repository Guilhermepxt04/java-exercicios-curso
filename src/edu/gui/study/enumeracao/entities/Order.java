package edu.gui.study.enumeracao.entities;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDateTime moment;
    private OrderStatus status;
    private List<OrderItem> items = new ArrayList<>();

    private static final DateTimeFormatter sdf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public String getMoment() {
        return sdf.format(moment);
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        Double totalPrice = 0.0;
        for (OrderItem item : items) {
            totalPrice += item.getPrice() * item.getQuantity();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order: " + sdf.format(moment) + " - " + status;
    }

}
