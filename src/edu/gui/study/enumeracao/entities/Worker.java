package edu.gui.study.enumeracao.entities;


import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Worker {

    //Atributos
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

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

    public List<HourContract> getContracts() {
        return contracts;
    }

    //Metodos
    public void addContract (HourContract contract) {
        contracts.add(contract);
    }

    public void removeContract (HourContract contract) {
        contracts.remove(contract);
    }

    public Double income(Month month, int year) {

        Double valuePerContract = 0.00;
        for (HourContract contract : contracts) {

            if (contract.getDate().getMonth() == month && contract.getDate().getYear() == year) {

                valuePerContract += contract.totalValue();

            }
        }
        return baseSalary + valuePerContract;
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
