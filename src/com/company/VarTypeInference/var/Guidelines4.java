package com.company.VarTypeInference.var;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class Guidelines4 {
    List<String> strings = List.of("hello","how","are","you");
    /*public Optional<String> getMaxEntry(){
        return strings.stream()
                .collect(groupingBy(s->s,counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey);
    }*/

    public Optional<String> getMaxEntry(){
        var collect = strings.stream()
                .collect(groupingBy(s -> s, counting()));
        var max = collect
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        return max
                .map(Map.Entry::getKey);
    }
}
