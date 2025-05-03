package edu.gui.study.set.model.entities;

import java.time.Instant;
import java.util.Objects;

public class User {

    private String name;
    private Instant login;

    public User(String name, Instant login) {
        this.name = name;
        this.login = login;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", login=" + login +
                '}';
    }
}
