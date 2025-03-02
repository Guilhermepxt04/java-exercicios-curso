package edu.gui.study.enumeracao.entities;


public class Worker {

    //Atributos
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;

    //Construtor
    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    //Getters e Setters
    public Double getBaseSalary() {
        return baseSalary;
    }

    //Metodos
    public void addContract () {

    }

    public void removeContract () {

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
