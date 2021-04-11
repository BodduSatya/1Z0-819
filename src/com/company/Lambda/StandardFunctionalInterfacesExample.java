package com.company.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles","Dickens",60),
                new Person("Lewis","Carroll",42),
                new Person("Thomas","Carlyle",51),
                new Person("Charlotte","Bronte",45),
                new Person("Mathew","Arnold",39)
        );

        //Step :1 sort list by lastname
        Collections.sort(people,(p2,p1)->p1.getLastName().compareTo(p2.getLastName()));

        //step :2 create a method that prints all elements in the list
        System.out.println("Printing all persons");
        performConditionally(people,p->true);

        //step3: create a method that prints all people that have last name begining with  C
        System.out.println("prints all people that have last name begining with  C");
        performConditionally(people,p->p.getLastName().startsWith("C"));

        System.out.println("prints all people that have first name begining with  C");
        performConditionally(people,p->p.getFirstName().startsWith("C"));

    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate) {
        for(Person p : people ){
            if( predicate.test(p))
                System.out.println(p);
        }
    }

}
