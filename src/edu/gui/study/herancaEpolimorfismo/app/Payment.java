package edu.gui.study.herancaEpolimorfismo.app;

import edu.gui.study.herancaEpolimorfismo.entities.Employee;
import edu.gui.study.herancaEpolimorfismo.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Payment {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {

            System.out.println("Employee #1 data: ");
            System.out.print("Outsorced (y/n)? ");
            char outsorced = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            Integer hours = sc.nextInt();

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            if (outsorced == 'y') {
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();

                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(employee);
            }
            else {
                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
        }

        System.out.println("PAYMENTS: ");

        for (Employee employee : employees) {

            System.out.println(employee.getName() + " - " + " $ " + String.format("%.2f", employee.payment()));
        }
    }
}
