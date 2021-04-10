package com.company.VarTypeInference.var;

import java.util.List;

public class Guideline1 {
    public static void main(String[] args) {
        List<String> result = List.of("hello","how","are","you","?");
        var stringList = List.of("hello","how","are","you","?");
    }
}
