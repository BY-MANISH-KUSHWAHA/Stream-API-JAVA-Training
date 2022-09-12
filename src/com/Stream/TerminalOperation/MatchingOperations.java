package com.Stream.TerminalOperation;

import java.util.ArrayList;
import java.util.List;

public class MatchingOperations {
    // lazy operation (take stream and process data and not pass any stream)
    // for each is a terminal operation and any last terminal
    public static void main(String[] args) {
        List<com.ComparatorAnonymous.Person> persons = new ArrayList<com.ComparatorAnonymous.Person>();
        persons.add(new com.ComparatorAnonymous.Person("Manish",29,"India"));
        persons.add(new com.ComparatorAnonymous.Person("Ravi",21,"Dubia"));
        persons.add(new com.ComparatorAnonymous.Person("Kusum",18,"USA"));
        persons.add(new com.ComparatorAnonymous.Person("Zoya",17,"UK"));
        persons.add(new com.ComparatorAnonymous.Person("Maya",16,"France"));

        //Example
        boolean anyPak = persons.stream().anyMatch(s -> s.getCountry().equals("Pak"));
        System.out.println("Anyone from Pak:"+anyPak);

        // AnyMatch
        //      -> true if a element exists,
        //      -> Stream is empty => true,
        //      -> if no element matches => false


        // AllMatch
        //      -> every element matches with the input => true,
        //      -> Stream is empty => true,
        //      -> If signal element not match => false

        // NoneMatch
        //      -> true if no element exists(no element matched).
        //      -> if the stream is empty => true
        //      -> If single element matched criteria => False

        // 1. Check if a Person belong to India
        boolean anyIndian = persons.stream().anyMatch(s -> s.getCountry().equals("India"));
        System.out.println("Any Indian:"+anyIndian);
        // 2. Check if all persons are less than the age of 30
        boolean anyLessThan30 = persons.stream().allMatch(s -> s.getAge()<30);
        System.out.println("All below 30:"+anyLessThan30);
        // 3. Check if none of the person name starts with letter Y
        boolean NonePersonNameStartWithY = persons.stream().map(t -> t.getName().substring(0, 1)).noneMatch(s -> s.equals("Y"));
        System.out.println("Name not start with Y:"+NonePersonNameStartWithY);


    }
}


class Person {
    private String name;
    private int age;
    private String country;

    public Person(String name,int age,String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }


}

