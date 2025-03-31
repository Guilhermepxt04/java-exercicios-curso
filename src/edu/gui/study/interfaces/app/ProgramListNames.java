package edu.gui.study.interfaces.app;

import edu.gui.study.interfaces.model.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProgramListNames {

    public static void main(String [] args) {

        List<Employee> list = new ArrayList<>();
        String path = "C:\\teste\\nomes.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String employeeCsv = br.readLine();
            while (employeeCsv != null) {
                String[] fields = employeeCsv.split(",");
                list.add(new Employee(fields[0], Double.parseDouble(fields[1])));
                employeeCsv = br.readLine();
            }
            Collections.sort(list);
            for (Employee employee : list) {
                System.out.println(employee);
            }

        } catch (IOException e) {
            System.out.println("error: " + e.getMessage());
        }

    }
}
