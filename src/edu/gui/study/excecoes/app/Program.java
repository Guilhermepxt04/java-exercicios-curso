package edu.gui.study.excecoes.app;

import edu.gui.study.excecoes.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number:");
        int number = sc.nextInt();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        sc.nextLine();
        String checkInString = sc.nextLine();
        LocalDate checkIn = LocalDate.parse(checkInString, df);
        System.out.print("Check-out date (dd/MM/yyyy): ");
        String checkOutString = sc.nextLine();
        LocalDate checkOut = LocalDate.parse(checkOutString, df);

        Reservation reservation = new Reservation(number, checkIn, checkOut);

        System.out.println(reservation);

        System.out.println();
        System.out.println("Enter data the update the reservation");

        System.out.print("Check-in date (dd/MM/yyyy): ");
        checkInString = sc.nextLine();
        checkIn = LocalDate.parse(checkInString, df);
        System.out.print("Check-out date (dd/MM/yyyy): ");
        checkOutString = sc.nextLine();
        checkOut = LocalDate.parse(checkOutString, df);

        reservation.updateDates(checkIn, checkOut);

        System.out.println(reservation);


        sc.close();
    }
}
