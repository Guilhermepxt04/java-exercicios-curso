package edu.gui.study.interfaces.model.services;

public class PaypalService implements OnlinePaymentService {


    private static final double FEE_PERCENTAGE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    @Override
    public double interest(Double value, Integer months) {
        return value * MONTHLY_INTEREST * months;
    }

    @Override
    public double paymentFee(Double value) {
        return value + (value * FEE_PERCENTAGE) ;
    }
}
