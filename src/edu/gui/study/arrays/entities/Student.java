package edu.gui.study.arrays.entities;

public class Student {

    //atributos
    private String name;
    private  String email;
    private int room;

    // construtores
    public Student(String name, String email, int room) {
        this.name = name;
        this.email = email;
        this.room = room;
    }

    //getters e setters

    public int getRoom() {
        return room;
    }

    //metodos
    @Override
    public String toString() {
        return room + ": " + name + ", " + email;
    }
}


