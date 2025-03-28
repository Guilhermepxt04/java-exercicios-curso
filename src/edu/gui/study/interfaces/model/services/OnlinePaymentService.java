package edu.gui.study.interfaces.model.services;

public interface OnlinePaymentService {

    double interest(Double value, Integer months);
    double paymentFee(Double value);
}
