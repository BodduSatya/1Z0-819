package com.company.functionalProgramming;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Supplier;

public class MySupplier {
    public static void main(String[] args) {
//        Supplier<LocalDate> s = () -> LocalDate.now() ; // LocalDate.now();
        Supplier<LocalDate> s = LocalDate::now; // LocalDate.now();
        LocalDate d1 = s.get();
        System.out.println("d1 = " + d1);

        Supplier<StringBuilder> sb1 = StringBuilder::new; //new StringBuilder();
        System.out.println(sb1.get().append("StringBuilder"));

        Supplier<ArrayList<String>> s3 = ArrayList<String>::new;
        ArrayList<String> a1 = s3.get();
        a1.add("Collection");
        System.out.println("a1 = " + a1);

    }
}
