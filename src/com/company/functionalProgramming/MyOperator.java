package com.company.functionalProgramming;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class MyOperator {
    public static void main(String[] args) {
        UnaryOperator<String> u1 = String::toUpperCase; //str->str.toUpperCase();
        System.out.println(u1.apply("chirp"));

        BinaryOperator<String> b1 = String::concat;
        System.out.println(b1.apply("bay","chick"));
    }
}
