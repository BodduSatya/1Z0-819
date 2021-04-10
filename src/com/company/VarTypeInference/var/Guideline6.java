package com.company.VarTypeInference.var;

import java.util.ArrayList;
import java.util.List;

public class Guideline6 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        var list1 = new ArrayList<>(); //ArrayList<Object>
        var list2 = new ArrayList<String>();

        var list3 = new ArrayList<>(list);//ArrayList<String>
    }
}
