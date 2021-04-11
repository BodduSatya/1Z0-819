package com.company.Lambda;

import java.util.function.BiConsumer;

public class ExceptionHandling {
    public static void main(String[] args) {
        int [] someNumbers = {1,2,3,4,5,6};
        //int key = 2;
        int key = 0;

        //process(someNumbers,key,(v,k)-> System.out.println(v/k));
        process(someNumbers,key,wrapperLambda((v,k)-> System.out.println(v/k)));

    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer,Integer> consumer) {
        for (int i : someNumbers){
            //System.out.println(i+key);
            consumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer,Integer> wrapperLambda(BiConsumer<Integer,Integer> consumer) {
        return (v,k) -> {
            try{
                consumer.accept(v,k);
            }catch (ArithmeticException e){
                System.out.println("Arthematic exception");
            }
        };
    }
}
