package edu.gui.study.enumeracao.entities;


import java.time.Month;

public class Worker {

    //Atributos
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;

    //Construtores
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Worker() {
    }

    //Getters e Setters
    public Double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    //Metodos
    public void addContract () {

    }

    public void removeContract () {

    }

    public Double income(Month month, int year) {
        return 0.00;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", baseSalary=" + baseSalary +
                ", department=" + department +
                '}';
    }

}
