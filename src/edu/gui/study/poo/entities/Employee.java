package edu.gui.study.poo.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {

        return grossSalary - tax;

    }

    public double increaseSalary(double percentage) {

        return grossSalary * (percentage / 100) + netSalary();

    }

    public String toString() {

        return ("Employee: " + name + ", $ " + String.format("%.2f", netSalary()));

    }

}
