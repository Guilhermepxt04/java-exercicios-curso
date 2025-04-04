package edu.gui.study.poo.app;

import java.util.Locale;
import java.util.Scanner;
import edu.gui.study.poo.entities.Employee;


public class EmployeeService {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee;
        employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.print("Wich percentage to increase salary: ");
        double percentage = sc.nextDouble();

        System.out.println("Updated data: " + employee.name + ", $ " + String.format("%.2f", employee.increaseSalary(percentage)));

        sc.close();
    }

}
