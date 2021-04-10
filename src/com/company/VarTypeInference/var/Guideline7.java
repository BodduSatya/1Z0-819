package com.company.VarTypeInference.var;

public class Guideline7 {
    public static void main(String[] args) {
        /*// No issue  wwith Boolean , long , string, and floating point
        boolean ready = true;
        char ch = '\ufffd';
        long sum = 0L;
        String label = "mombat";
        float f1 = 1.8f;
        double d1 = 3.0;

//        whole number inferred as integer
        byte flags = 0;
        short mask = 0x7fff;
        long base = 17;*/




        // after change
        var ready = true; //boolean
        var ch = '\ufffd'; //char
        var sum = 0L;//long
        var label = "mombat"; //string
        var f1 = 1.8f;//float
        var d1 = 3.0;//double

//        whole number inferred as integer
        var flags = 0; // compiler will assign int
        var mask = 0x7fff;//int
        var base = 17;//int


    }
}
