package edu.gui.study.herancaEpolimorfismo.app;

import edu.gui.study.herancaEpolimorfismo.entities.ImportedProduct;
import edu.gui.study.herancaEpolimorfismo.entities.Product;
import edu.gui.study.herancaEpolimorfismo.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Shop {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        List<Product> products = new ArrayList<>();

        Product product;

        System.out.print("Enter the number of prodcuts: " );
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {

            System.out.printf("Product #%d data: %n", i + 1);

            System.out.print("Common, used, or imported (c/u/i)? ");
            char state = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Price: ");
            Double price = sc.nextDouble();

            switch (state) {
                case 'c':
                    product = new Product(name, price);
                    products.add(product);
                    break;
                case 'u':
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    sc.nextLine();
                    LocalDate manufactureDate = LocalDate.parse(sc.nextLine(), fmt1);
                    product = new UsedProduct(name, price, manufactureDate);
                    products.add(product);
                    break;
                case 'i':
                    System.out.print("Customs fee: ");
                    Double customsFee = sc.nextDouble();
                    product = new ImportedProduct(name, price, customsFee);
                    ((ImportedProduct) product).totalPrice();
                    products.add(product);
            }
        }

        System.out.println("PRICE TAGS: ");

        for (Product p : products) {
            System.out.println(p.priceTag());
        }

        sc.close();
    }
}
