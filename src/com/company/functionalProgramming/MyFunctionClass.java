package com.company.functionalProgramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class MyFunctionClass {
    public static void main(String[] args) {
        Function<String,Integer> f1 = String::length; // str -> str.length();
        System.out.println(f1.apply("satya"));

        BiFunction<String,String,String> b1 = String::concat;//(str,toAdd) -> str.concat(toAdd)
        System.out.println(b1.apply("Satya","Narayanna"));
    }

}

@FunctionalInterface
interface TriFunction<T,U, V, R>{
    R appy(T t,U u, V v);
}

@FunctionalInterface
interface QuardFunction<T, U, V, W, R>{
    R apply (T t, U u, V v, W w);
}
