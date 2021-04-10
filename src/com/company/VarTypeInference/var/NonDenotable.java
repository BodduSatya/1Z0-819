package com.company.VarTypeInference.var;

import java.io.Serializable;
import java.util.function.Function;

public class NonDenotable {
    public static void main(String[] args) {
        //Anonymous class
        /*Object productInfo = new Object(){
             String name = "Apple";
             int total = 0;
        };
        System.out.println("productInfo = " + productInfo.name);*/

        var productInfo = new Object(){
            String name = "Apple";
            int total = 0;
        };
        System.out.println("productInfo = " + productInfo.name);

        //Intersection type
//        (Function<Integer,Integer> & Serializable) a = (Function<Integer,Integer> & Serializable) i -> i+1; // does not compile

//        Function<Integer,Integer> f = (Function<Integer, Integer> & Serializable) i->i+1;
//        Serializable s = (Function<Integer,Integer> & Serializable) i -> i+1;

        var action = (Function<Integer,Integer> & Serializable) i -> i+1;

    }

}
