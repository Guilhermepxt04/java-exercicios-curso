package edu.gui.study.enumeracao.app;

import edu.gui.study.enumeracao.entities.*;
import edu.gui.study.enumeracao.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Shop {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Birth date: ");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt1) ;

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.nextLine();
        OrderStatus orderStatus = OrderStatus.valueOf(status);

        LocalDateTime momment = LocalDateTime.now();


        Order order = new Order(momment, orderStatus);


        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {

            System.out.println("Enter #" + (i+1) + " item data:");

            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();

            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();

            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(product, quantity, productPrice);

            order.addItem(orderItem);
        }


        System.out.println("ORDER SUMMARY: ");
        System.out.println("Order moment: " + order.getMoment());
        System.out.println("Order status: " + order.getStatus());
        System.out.println(client);
        System.out.println("Order items: ");
        for (OrderItem item : order.getItems()) {
                System.out.println(item.getProductName() + ", Quantity: " + item.getQuantity() + ", Subtotal: " + String.format("%.2f", item.subTotal()));
        }
        System.out.printf("Total price: %.2f%n", order.total());

        sc.close();
    }

}
