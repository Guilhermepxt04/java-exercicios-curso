package edu.gui.study.enumeracao.entities;

public class Department {

    private String name;

    public Department(String name) {
        this.name = name;
    }

    public Department() {
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Department: " + name ;
    }
}
