package edu.gui.study.enumeracao.app;

import edu.gui.study.enumeracao.entities.Department;
import edu.gui.study.enumeracao.entities.HourContract;
import edu.gui.study.enumeracao.entities.Worker;
import edu.gui.study.enumeracao.entities.WorkerLevel;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.Locale;

/**
 * @author = Guilherme Peixoto
 * @version = 1.0
 * @since = 01/03/2025
 */

public class SalaryMonth {

    public static void main(String [] args) throws ParseException {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Enter department's name: ");
        String nameDepartment = sc.nextLine();
        Department department = new Department(nameDepartment);

        System.out.println("Enter worker data: ");

        System.out.print("Name: ");
        String nameWorker = sc.nextLine();

        System.out.print("Level: ");
        String level = sc.nextLine().toUpperCase();
        WorkerLevel workerLevel = WorkerLevel.valueOf(level);

        System.out.print("Base Salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(nameWorker, workerLevel, baseSalary, department);


        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {

            System.out.printf("Enter contract #%d data: %n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate date = LocalDate.parse(sc.nextLine(), fmt1);

            System.out.print("Value per hour: ");
            Double valuePerHour = sc.nextDouble();

            System.out.print("Duration (hours): ");
            Integer duration = sc.nextInt();

            HourContract contract = new HourContract(date, valuePerHour, duration);
            worker.addContract(contract);

        }

        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("MM/yyyy");
        sc.nextLine();
        YearMonth monthIncome = YearMonth.parse(sc.nextLine(), fmt2);


        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthIncome + ": " + (String.format("%.2f", worker.income(monthIncome.getMonth(), monthIncome.getYear()))));


        sc.close();
    }
}
