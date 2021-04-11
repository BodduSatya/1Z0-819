package com.company.functionalProgramming;

@FunctionalInterface
public interface MyFunction {
    boolean test(Animal a);

    //The following methods don't count in sAM test
    boolean equals(Object object);
    int hashCode();
    String toString();

//    int toString();

}
