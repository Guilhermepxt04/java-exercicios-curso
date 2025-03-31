package edu.gui.study.interfaces.model.services;


public class BrazilInterestService implements InterestService {

    double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }


    @Override
    public double getInterestRate() {
        return interestRate;
    }


}
