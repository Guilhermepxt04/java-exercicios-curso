package edu.gui.study.list.entities;

public class Employee {

    //atributos
    final private Integer ID;
    private String name;
    private Double salary;


    //Construtor
    public Employee(int id, String name, double salary) {
        this.ID = id;
        this.name = name;
        this.salary = salary;
    }

    //getters e setters
    public int getId() {
        return ID;
    }

    //metodos
    public void increaseSalary(double porcentage) {
        this.salary += this.salary / 100 * porcentage;
    }

    @Override
    public String toString() {
        return this.ID + ", " + this.name + ", " + String.format("%.2f", this.salary);
    }
}
