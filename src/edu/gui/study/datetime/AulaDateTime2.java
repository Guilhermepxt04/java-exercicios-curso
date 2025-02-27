package edu.gui.study.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class AulaDateTime2 {

    public static void main(String [] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:00Z");

        //for (String s : ZoneId.getAvailableZoneIds()) {
        //    System.out.println(s);
        //}

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("Portugal"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println("d02 dia = " + d02.getDayOfMonth());
        System.out.println("d02 mes = " + d02.getMonthValue());
        System.out.println("d02 mes = " + d02.getYear());
        System.out.println("d02 hora = " + d02.getHour());
    }

}
