package edu.gui.study.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class AulaDateTime3 {

    public static void main(String [] args) {

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();

        LocalDate pastWeekLocalDate = d01.minusWeeks(1);
        LocalDate nextWeekLocalDate = d01.plusDays(7);

        LocalDateTime nextWeekLocaleDateTime = d02.minus(7, ChronoUnit.HOURS);

        System.out.println(d01);
        System.out.println(pastWeekLocalDate);
        System.out.println(nextWeekLocalDate);

        System.out.println("--------------");

        System.out.println(d02);
        System.out.println(nextWeekLocaleDateTime);

        System.out.println("-------------");

        Duration t1 = Duration.between(nextWeekLocaleDateTime, d02);

        System.out.println("t1 = " + t1);

        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());

        System.out.println("t2 = " + t2.toDays());
    }
}
