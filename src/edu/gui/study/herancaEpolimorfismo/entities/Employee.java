package edu.gui.study.herancaEpolimorfismo.entities;


public class Employee {

    private String name;
    private Integer hours;
    private Double valuePerHour;

    public Employee() {}

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public Double payment () {
        return this.valuePerHour * this.hours;
    }


}
