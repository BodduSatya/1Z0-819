package com.company;

import java.util.Locale;

public class LocaleDemo {
    public static void main(String[] args) {
        /**
         * 1. constants
                Locale.CANADA
           2. constructor
                new Locale("fr");
                new Locale("en","US");
           3. Builder design pattern
                Locale l = new Locale.Builder()
                                .setLanguage("en")
                                .setRegion("US")
                                .build();
         public static Locale getDefault();
         public static void setDefault();
         public static void setDefault(Locale.Category category, Locale newLocale);
         **/


        Locale l = Locale.getDefault();
        System.out.println(l);

        //select Locale
        System.out.println(Locale.GERMAN);
        System.out.println(Locale.GERMANY);

        System.out.println(new Locale("fr"));
        System.out.println(new Locale("fr","PK"));
        System.out.println(new Locale("xx","XX"));

        //set local
        Locale l3 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("US")
                .build();
        System.out.println(l3);

        Locale l4 = new Locale.Builder()
                .setLanguage("en")
                .setRegion("IN")
                .build();
        System.out.println(l4);

        Locale.setDefault(l3);
        System.out.println(Locale.getDefault());
    }
}
