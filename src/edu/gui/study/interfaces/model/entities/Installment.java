package edu.gui.study.interfaces.model.entities;

import java.time.LocalDate;

public class Installment {

    private LocalDate dueDate;
    private Double value;

    public Installment(LocalDate dueDate, Double value) {
        this.dueDate = dueDate;
        this.value = value;
    }

    @Override
    public String toString() {
        return dueDate +
                " - " + String.format("%.2f", value);
    }
}
