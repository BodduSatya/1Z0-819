package com.company.exceptionhandling.types;

public class TryClassCastException {
    public static void main(String[] args) {
        //class cast exception
        String s = "good";
//        int c = (Integer) s;
        Object o = s;
        int d = (Integer) o;
    }
}
