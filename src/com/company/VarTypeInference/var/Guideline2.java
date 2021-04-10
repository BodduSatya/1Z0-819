package com.company.VarTypeInference.var;

import java.util.ArrayList;

public class Guideline2 {
    public static void main(String[] args) {
        var stringList = new ArrayList<String>();

        //.. 100 line of code

        stringList.add("MUST_BE_PROCESSED_LAST");

        for( var str : stringList ){
            System.out.println("str = " + str);
        }
    }
}
