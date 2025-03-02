package edu.gui.study.enumeracao.app;

import edu.gui.study.enumeracao.entities.Department;
import edu.gui.study.enumeracao.entities.Worker;
import edu.gui.study.enumeracao.entities.WorkerLevel;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
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

        System.out.println(worker);

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i<n; i++) {

            System.out.printf("Enter contract #%d data: %n", i + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            sc.nextLine();
            String date = sc.nextLine();
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
            Date dateContract = formatoData.parse(date);
            System.out.println(dateContract);
        }

    }
}
