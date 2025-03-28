package edu.gui.study.interfaces.model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {

    private Integer number;
    private LocalDate date;
    private Double valueTotal;
    private Installment installment;

    private List<Installment> installmentsList = new ArrayList<>();

    public Contract() {
    }

    public Contract(Integer number, LocalDate date, Double valueTotal) {
        this.number = number;
        this.date = date;
        this.valueTotal = valueTotal;
    }

    public LocalDate getDate() {
        return date;
    }

    public Double getValueTotal() {
        return valueTotal;
    }

    public Installment getInstallment() {
        return installment;
    }

    public List<Installment> getInstallmentsList() {
        return installmentsList;
    }

    public void setInstallment(Installment installment) {
        this.installment = installment;
    }

    public void addInstalmentsList(Installment installment) {
        installmentsList.add(installment);
    }


    @Override
    public String toString() {
        return "Contract{" +
                "number=" + number +
                ", date=" + date +
                ", valueTotal=" + valueTotal +
                '}';
    }
}
