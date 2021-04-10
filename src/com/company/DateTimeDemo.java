package com.company;

import java.time.*;

public class DateTimeDemo {
    public static void main(String[] args) {
        //now()
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

        //of()
        LocalDate date1 = LocalDate.of(2020, Month.APRIL,04);
        LocalTime time1 = LocalTime.of(10,20,59);

        LocalDateTime dateTime1 = LocalDateTime.of(date1,time1);
        LocalDateTime dateTime2 = LocalDateTime.of(2021,11,18,07,01,00);

        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getDayOfWeek());
        System.out.println(date1.getDayOfYear());
        System.out.println(date1.getMonth());
        System.out.println(date1.getYear());
    }
}
