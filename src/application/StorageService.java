package application;

import entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class StorageService {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Product product;

        product = new Product();

        System.out.println(("Enter product data: "));

        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.printf("Product data: %s, $ %.2f, %d, Total: $ %.2f%n ", product.name, product.price, product.quantity, product.totalValueInStock());


        System.out.print("Enter the number of products to be added in stock: ");
        int add = sc.nextInt();
        product.addProducts(add);

        System.out.printf("Updated data: %s, $ %.2f, %d, Total: $ %.2f%n ", product.name, product.price, product.quantity, product.totalValueInStock());


        System.out.print("Enter the number of products to be removed from stock: ");
        int remove = sc.nextInt();
        product.removeProducts(remove);

        System.out.printf("Updated data: %s, $ %.2f, %d, Total: $ %.2f%n ", product.name, product.price, product.quantity, product.totalValueInStock() );


        sc.close();
    }

}
