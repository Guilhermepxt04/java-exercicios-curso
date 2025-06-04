package edu.gui.study.stream.model.app;

import edu.gui.study.stream.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramSalary {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        List<Employee> employees = new ArrayList<>();
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();

            while (line != null) {

                String[] parts = line.split(",");

                employees.add(new Employee(parts[0], parts[1], Double.valueOf(parts[2])));

                line = br.readLine();
            }

            System.out.print("Enter the salary: ");
            Double inputSalary = sc.nextDouble();

            System.out.println("Email of people whose salary is more tha 2000.00: ");

            List<String> emails = employees.stream()
                    .filter(e -> e.getSalary() > inputSalary)
                    .map(e -> e.getEmail())
                    .sorted()
                    .toList();

            emails.forEach(System.out::println);

            Double sum = employees.stream()
                            .filter(e -> e.getName().charAt(0) == 'M')
                            .map(e -> e.getSalary())
                            .reduce(0.0, (x, y) -> x + y);


            System.out.println("Sum of salary of people whose name starts with 'M' : " + String.format("%.2f", sum));

        } catch (IOException e) {

            System.out.println("Error" + e.getMessage());
        }

        sc.close();
    }
}
