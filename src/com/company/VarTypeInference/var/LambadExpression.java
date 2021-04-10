package com.company.VarTypeInference.var;

import java.util.function.BiFunction;
import java.util.function.Function;

public class LambadExpression {
    public static void main(String[] args) {
        Function<Integer,Integer> f = (var num)->1;
//        var f1 = (var num) -> 1;

        BiFunction<Integer,Integer,String> f2 = (@NotNull var a,var b)->"Hello";

    }
}
