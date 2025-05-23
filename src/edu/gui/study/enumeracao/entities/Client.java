package edu.gui.study.enumeracao.entities;


import java.time.LocalDate;

public class Client {

    private String name;
    private String email;
    private LocalDate birthDate;


    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Client: " +
                name +
                " (" + birthDate + ") " +
                "- " + email;
    }

}
