package edu.gui.study.stream.model.app;

import edu.gui.study.stream.model.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter the path file: ");
        String path = sc.nextLine();

         try (BufferedReader br = new BufferedReader(new FileReader(path));) {

             String line = br.readLine();

             while (line != null) {

                 String[] parts = line.split(",");
                 Double price = Double.parseDouble(parts[1]);
                 String name = parts[0];

                 products.add(new Product(name, price));

                 line = br.readLine();
             }



             double avg = products.stream()
                     .map(p -> p.getPrice())
                     .reduce(0.0, (x, y) -> x + y) / products.size();

             System.out.printf("Average price: %.2f%n", avg);

             Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

             List<String> names = products.stream()
                     .filter(p -> p.getPrice() < avg)
                     .map(p -> p.getName())
                     .sorted(comp.reversed())
                     .toList();

             names.forEach(System.out::println);

         } catch (IOException e) {
             System.out.println(e.getMessage());
         }

         sc.close();
    }
}
