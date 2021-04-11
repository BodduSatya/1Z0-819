package com.company.functionalProgramming;

public class AnanymousVsLambda {
    public void instanceMethod(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println(this);
            }

            @Override
            public String toString() {
                return "Ananymous Inner class";
            }
        };
        runnable.run();

        runnable = () -> System.out.println(this);
        runnable.run();
    }

    @Override
    public String toString() {
        return "Parent outer class";
    }

    public static void main(String[] args) {
        new AnanymousVsLambda().instanceMethod();
    }
}
