package edu.gui.study.arquivos.app;

import edu.gui.study.arquivos.model.entities.Product;

import java.io.*;
import java.util.*;

public class Program {

    public static void main (String [] args) {

        List<Product> products = new ArrayList<>();
        Locale.setDefault(Locale.US);

        try (Scanner sc = new Scanner(System.in)){

            System.out.print("Enter a csv path: ");
            String strPath = sc.nextLine();
            File path = new File(strPath);

            new File( "C:\\teste\\out").mkdir();

            try (BufferedReader br = new BufferedReader(new FileReader(path))){

                    String line = br.readLine();

                    while (line != null) {

                        String[] parts = line.split(";");

                        String name = parts[0];
                        Double price = Double.parseDouble(parts[1]);
                        Integer quantity = Integer.parseInt(parts[2]);

                        Product product = new Product(name, price, quantity);
                        products.add(product);

                        line = br.readLine();
                    }
            } catch (IOException e) {
                System.out.println(("Error reading file: " + e.getMessage()));
            }
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\teste\\out\\summary.csv"))){

            for (Product p : products) {

                bw.write(p.getName() + ";" + String.format("%.2f", p.getPrice()) + ";" + String.format("%.2f", p.totalPrice()));
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writer file: " + e.getMessage());
        }
    }
}
