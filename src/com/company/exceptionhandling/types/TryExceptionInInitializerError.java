package com.company.exceptionhandling.types;

public class TryExceptionInInitializerError {
    static{
        int[] s = new int[3];
        System.out.println(s[-1]);
    }

    public static void main(String[] args) {

    }
}
