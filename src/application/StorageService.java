package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class StorageService {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println(("Enter product data: "));

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();

        Product product = new Product(name, price);

        product.setName("Computer");

        System.out.println("Product data: " + product);
        System.out.printf("Update name: %s%n", product.getName());


        System.out.print("Enter the number of products to be added in stock: ");

        int add = sc.nextInt();
        product.addProducts(add);

        System.out.println("Updated data: " + product );


        System.out.print("Enter the number of products to be removed from stock: ");

        int remove = sc.nextInt();
        product.removeProducts(remove);

        System.out.println("Updated data: " + product);


        sc.close();
    }

}
