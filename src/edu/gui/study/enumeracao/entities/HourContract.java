package edu.gui.study.enumeracao.entities;

import java.time.LocalDate;

public class HourContract {

    private LocalDate date;
    private Double valuePerHour;
    private Integer hours;

    //Construtores
    public HourContract(LocalDate date, Double valuePerHour, Integer hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public HourContract() {
    }


    //Getters e Setters
    public LocalDate getDate() {
        return date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    //Metodos
    public Double totalValue() {

        return valuePerHour * hours;

    }

    @Override
    public String toString() {
        return "HourContract{" +
                "date=" + date +
                ", valuePerHour=" + valuePerHour +
                ", hours=" + hours +
                '}';
    }
}
