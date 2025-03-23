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
            String strSourcefile = sc.nextLine();
            File sourceFile = new File(strSourcefile);

            String sourceFolder = sourceFile.getParent();

            new File(sourceFolder + " \\out").mkdir();

            try (BufferedReader br = new BufferedReader(new FileReader(sourceFile))){

                    String line = br.readLine();

                    while (line != null) {

                        String[] parts = line.split(";");

                        String name = parts[0];
                        Double price = Double.parseDouble(parts[1]);
                        Integer quantity = Integer.parseInt(parts[2]);

                        products.add(new Product(name, price, quantity));

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

            System.out.println("SUMMARY CREATED");

        } catch (IOException e) {
            System.out.println("Error writer file: " + e.getMessage());
        }
    }
}
