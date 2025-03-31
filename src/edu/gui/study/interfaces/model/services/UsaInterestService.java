package edu.gui.study.interfaces.model.services;


public class UsaInterestService implements InterestService {

    double interestRate;

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }


    @Override
    public double getInterestRate() {
        return interestRate;
    }

}
