package edu.gui.study.list.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import edu.gui.study.list.entities.Employee;

/**
 * @author = Guilherme Peixoto
 * @version = 1.8
 * @since = 21/02/2025
 */


public class SalaryIncrease {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("How many employees will be registered?: ");
        int n = sc.nextInt();
        int id;
        String name;
        double salary;
        double porcentage;
        Employee employee = null;

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i<n; i++) {

            System.out.printf("Employee #%d %n", i + 1);
            System.out.print("id: ");
            id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            name = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextDouble();

            employee = new Employee(id, name, salary);

            employees.add(employee);
        }

        System.out.print("Enter the employee id taht will have salary increase: ");
        int finalId = sc.nextInt();


        Employee employeeSalaryIncreased = employees.stream().filter(x -> x.getId() == finalId).findFirst().orElse(null);


        if (employeeSalaryIncreased != null) {
            System.out.print("Enter the percentage: ");
            porcentage = sc.nextDouble();
            employeeSalaryIncreased.increaseSalary(porcentage);
        }
        else {
            System.out.println("This id does not exist");
        }

        System.out.println("List of employees: ");

        for (Employee e : employees) {
            System.out.println(e);
        }


        sc.close();
    }
}
