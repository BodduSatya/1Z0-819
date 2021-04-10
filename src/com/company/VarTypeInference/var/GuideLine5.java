package com.company.VarTypeInference.var;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class GuideLine5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list = new CopyOnWriteArrayList<>();
        list = new LinkedList<>();

        var list1 = new ArrayList<>();
//        list1 = new CopyOnWriteArrayList<>();
//        list1 = new LinkedList<>();

    }
}
