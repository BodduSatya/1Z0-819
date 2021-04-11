package com.company.functionalProgramming;

import java.util.function.Predicate;

public class Closure {
    private String instanceVariable;
    private static String staticVariable;

    public void instanceMethod(/*final */String parameter){
        /*final */String localVariable = "local";
        staticVariable = "allowed";

        Predicate<String> p = str ->(instanceVariable+parameter+localVariable+staticVariable).length() ==10;

        //parameter = "not allowed";
        //localVariable = "not allowed";

        staticVariable = "allowed";
        instanceVariable = "allowed";
    }
}
