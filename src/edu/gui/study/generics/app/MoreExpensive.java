package edu.gui.study.generics.app;

import edu.gui.study.generics.model.entities.Product;
import edu.gui.study.generics.model.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MoreExpensive {

    public static void main(String[] args) throws IOException {

        try {

            Locale.setDefault(Locale.US);
            List<Product> list = new ArrayList<>();

            String path = "C:\\teste\\produtos.txt";

            BufferedReader br = new BufferedReader(new FileReader(path));

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Product x = CalculationService.max(list);
            System.out.println("Max: ");
            System.out.println(x);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
