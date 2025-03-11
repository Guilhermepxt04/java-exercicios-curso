package edu.gui.study.herancaEpolimorfismo.entities;

public class OutsourcedEmployee extends Employee {

    Double additional;

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additional) {
        super(name, hours, valuePerHour);
        this.additional = additional;
    }

    public Double additionalCharge () {
        return super.payment() + (this.additional / 100 * 110);
    }
}
