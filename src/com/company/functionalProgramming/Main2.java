package com.company.functionalProgramming;

import java.util.function.Predicate;

public class Main2 {
    public static void main(String[] args) {
        //in java7 - ananymous classes
        Predicate<Animal> checker = new Predicate<Animal>() {
            @Override
            public boolean test(Animal a) {
                return a.isHop();
            }
        };

        //in java 8-lambda
        /**/
        checker = (Animal a) -> { return a.isHop(); };
        checker = (a) -> { return a.isHop(); };
        checker = a -> { return a.isHop(); };
        checker = a ->  a.isHop(); //most simplified form
        checker = (a) -> a.isHop();
        checker = (Animal a) -> a.isHop();

        // - Method reference
        checker = Animal::isHop;

        //in java 11
        var test = (MyFunction) a-> a.isHop();

        System.out.println("test = " + test);
        /**
         * Execution - object will not be created unless we call the implementation of method
         */
        System.out.println(checker.test(new Animal()));
    }
}
