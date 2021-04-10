package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormatDateTime {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2020, Month.APRIL,04);
        LocalTime time1 = LocalTime.of(10,20,59);

        LocalDateTime dateTime1 = LocalDateTime.of(date1,time1);
        LocalDateTime dateTime2 = LocalDateTime.of(2021,11,18,07,01,00);

        // format()
        // built - in formatter constants
        System.out.println(date1.format(DateTimeFormatter.ISO_DATE));
        System.out.println(time1.format(DateTimeFormatter.ISO_TIME));
        System.out.println(dateTime2.format(DateTimeFormatter.ISO_DATE_TIME));

//        System.out.println(date1.format(DateTimeFormatter.ISO_TIME)); // no complile time error, run time  exception
//        System.out.println(time1.format(DateTimeFormatter.ISO_DATE)); // no complile time error, run time  exception

        //Custom format
        var dateFormatter = DateTimeFormatter.ofPattern("dd_MMM_yyyy");
        System.out.println(dateFormatter.format(dateTime1));

        var timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");
        System.out.println(timeFormatter.format(time1));

//        var datetimeFormatter = DateTimeFormatter.ofPattern("dd_MMM_yyyy HH:mm:ss.SSS z");
//        System.out.println(datetimeFormatter.format(dateTime1));

        //add custom text
        var f = DateTimeFormatter.ofPattern("MMMM dd,yyyy 'at' hh:mm");
        System.out.println(f.format(dateTime1));

        var f2 = DateTimeFormatter.ofPattern("MMMM dd,yyyy ' partie''s at' hh:mm");
        System.out.println(f2.format(dateTime1));

        var f3 = DateTimeFormatter.ofPattern("'System format,hh:mm' hh:mm");
        System.out.println(f3.format(time1));

        var f4 = DateTimeFormatter.ofPattern("'New ' yyyy 'Year'");
        System.out.println(f4.format(date1));

        //DateTimeFormatter.ofPattern("Time  is hh:mm"); // runtime exception // missing escape sequence.
        //DateTimeFormatter.ofPattern("'Time  is hh:mm"); // runtime exception // missing closing escape sequence.

        // in java7
        DateFormat s = new SimpleDateFormat("MMM dd,yyyy 'at' hh:mm");
        System.out.println(s.format(new Date()));

    }
}
