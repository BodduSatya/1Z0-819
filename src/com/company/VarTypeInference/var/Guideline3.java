package com.company.VarTypeInference.var;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Guideline3 {
    public static void main(String[] args) throws IOException {
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        BufferedReader reader = Files.newBufferedReader(Path.of(""));
//        List list = List.of("a","b","c");

        var outputStream = new ByteArrayOutputStream();
        var reader = Files.newBufferedReader(Path.of(""));
        var list = List.of("a","b","c");
    }


}
