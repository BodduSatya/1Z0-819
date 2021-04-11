package com.company.functionalProgramming;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class MyPredicate {
    public static void main(String[] args) {
        Predicate<String> p1 = String::isEmpty; // s -> s.isEmpty();
        System.out.println(p1.test(""));

        BiPredicate<String,String> b1 = String::startsWith; //(str,prefix) -> str.startsWith(prefix)
        b1.test("Satya","s");
    }
}
