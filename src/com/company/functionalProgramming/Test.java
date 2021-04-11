package com.company.functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Test {
    public static void main(String[] args) {
        /*
          <List> ex1 = x -> "".equals(x.get(0));
          <Long> ex2 = (Long l) -> System.out.println(l);
          <String,String> ex3 = (s1,s2) ->false;
        */

        Predicate<List> p = (x) -> "".equals(x.get(0));
        List l = new ArrayList();
        l.add("");
        System.out.println(p.test(l));

        Consumer<Long> c = System.out::println;
        c.accept(10L);

        BiPredicate<String,String> bp =  (s1,s2) -> s1.contains(s2);
        System.out.println(bp.test("satyanarayana","satya"));

        /*Function<List<String>> ex4 = x-> x.get(0); // does not compile
        UnaryOperator<Long> ex5 = (Long l) -> 3.14; // does not compile
        Predicate ex6 = String::isEmpty;*/ // does not compile

        Function<List<String>,String> ex4 = x-> x.get(0); // does not compile
        UnaryOperator<Long> ex5 = (Long l2) -> 3L; // does not compile
        Predicate<String> ex6 = String::isEmpty; // does not compile
    }
}
