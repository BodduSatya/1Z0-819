package com.company.Lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StandardFunctionalInterfacesExample2 {
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
        performConditionally(people,p->true, System.out::println);

        //step3: create a method that prints all people that have last name begining with  C
        System.out.println("\nprints all people that have last name begining with  C");
        performConditionally(people,p->p.getLastName().startsWith("C"),p-> System.out.println(p));

        System.out.println("\nprints all people that have first name begining with  C");
        performConditionally(people,p->p.getFirstName().startsWith("C"),p-> System.out.println(p));

    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer ) {
        for(Person p : people ){
            if( predicate.test(p))
                consumer.accept(p);
        }
    }

}
