package edu.gui.study.interfaces.model.entities;

public class Employee implements Comparable<Employee> {

    private String name;
    private Double salary;


    public Employee(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee other) {
        return -salary.compareTo(other.getSalary());
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", salary);
    }
}
