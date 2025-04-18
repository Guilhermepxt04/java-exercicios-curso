package edu.gui.study.interfaces.model.services;

import edu.gui.study.interfaces.model.entities.Contract;
import edu.gui.study.interfaces.model.entities.Installment;


public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
        for (int i = 1; i < months + 1; i++) {

            contract.setInstallment(new Installment(contract.getDate().plusMonths(i),
                    onlinePaymentService.paymentFee(contract.getValueTotal() / months + onlinePaymentService.interest(contract.getValueTotal() / months, i))));

            contract.addInstalmentsList(contract.getInstallment());
        }
    }

}
