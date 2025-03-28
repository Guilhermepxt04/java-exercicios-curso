package edu.gui.study.interfaces.app;

import edu.gui.study.interfaces.model.entities.Contract;
import edu.gui.study.interfaces.model.entities.Installment;
import edu.gui.study.interfaces.model.services.ContractService;
import edu.gui.study.interfaces.model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramContracts {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ContractService contractService = new ContractService(new PaypalService());

        System.out.println("Entre os dados do contrato: ");

        System.out.print("Numero: ");
        int number = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        sc.nextLine();
        LocalDate date = LocalDate.parse(sc.nextLine(), fmt);

        System.out.print("Valor do contrato: ");
        double valueTotal = sc.nextDouble();

        Contract contract = new Contract(number, date, valueTotal);

        System.out.print("Entre com o numero de parcelas: ");
        int parcels = sc.nextInt();


        contractService.processContract(contract, parcels);



        System.out.println("Parcelas: ");
        for (Installment installment : contract.getInstallmentsList()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
