package edu.gui.study.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class AulaDateTime {

    public static void main(String [] args) {

        // formatar datas
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmtCustom = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmtCustom2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmtCustom3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); //pega o fuso horario do computador do usuario

        // tipos de instanciação de datetime
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2025-02-26");
        LocalDateTime d05 = LocalDateTime.parse("2025-02-25T12:30:00");
        Instant d06 = Instant.parse("2025-02-25T12:30:00Z");
        Instant d07 = Instant.parse("2025-02-25T12:30:00-03:00");

        LocalDate d08 = LocalDate.parse("26/02/2025", fmt1);
        LocalDateTime d09 = LocalDateTime.parse("26/02/2025 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2025, 2, 26);
        LocalDateTime d11 = LocalDateTime.of(2025, 2, 26, 12, 30, 0);

        LocalDate d12 = LocalDate.parse("2025-02-25");
        LocalDateTime d13 = LocalDateTime.parse("2025-02-26T12:30");

        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
        System.out.println("-----------------");
        System.out.println("d12 = " + d12.format(fmtCustom));
        System.out.println("d12 = " + fmtCustom.format(d12));
        System.out.println("d12 = " + d12.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println("----------------");
        System.out.println("d13 = " + d13.format(fmtCustom2));
        System.out.println("d06 = " + fmtCustom3.format(d06));

    }
}
