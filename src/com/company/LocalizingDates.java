package com.company;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocalizingDates {
    /*
    * Formatting dates  DateTimeFormatter.ofLocalizedDate(dateStyle);
    * Formatting times  DateTimeFormatter.ofLocalizedTime(timeStyle);
    * Formatting times  DateTimeFormatter.ofLocalizedDateTime(dateStyle,timeStyle);
    * Formatting times  DateTimeFormatter.ofLocalizedDateTime(datetimeStyle);
    * */
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en","US"));
        var italy = new Locale("it","IT");
        var dt = LocalDateTime.of(2020, Month.APRIL,23,8,59,59);

        print(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL),dt,italy);
        print(DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT),dt,italy);
        print(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT),dt,italy);
    }

    private static void print(DateTimeFormatter dtf,LocalDateTime dt,Locale locale){
        System.out.println(dtf.format(dt)+" , "+dtf.withLocale(locale).format(dt));
    }
}
