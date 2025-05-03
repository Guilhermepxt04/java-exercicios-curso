package edu.gui.study.hascodeEequals;

import java.util.Objects;

public class Cliente {

    private String name;
    private String email;

    public Cliente(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass())
            return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(name, cliente.name) && Objects.equals(email, cliente.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }
}
