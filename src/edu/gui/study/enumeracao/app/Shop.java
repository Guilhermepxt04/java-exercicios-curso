package edu.gui.study.enumeracao.app;

import edu.gui.study.enumeracao.entities.Client;
import edu.gui.study.enumeracao.entities.OrderItem;
import edu.gui.study.enumeracao.entities.OrderStatus;
import edu.gui.study.enumeracao.entities.Product;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Shop {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
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
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {

            System.out.println("Enter #" + (i+1) + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            sc.nextLine();
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            Integer quantity = sc.nextInt();

            Product product = new Product(productName, productPrice);
            OrderItem = new OrderItem()

        }
    }

}
