package com.mystream.IntermediateOperations;

import com.predicateFunctionalInterface.Person;

import java.util.ArrayList;
import java.util.List;

public class FilteringOperation {
    // Intermidate just take data and process data and just pass another stream
    public static void main(String[] args) {
        // List of Integer
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(5);

        // Print all element which is greater than 2
        System.out.println("all elements which are greater than 2");
        list.stream().filter(s -> s>2).forEach(System.out::println);

        System.out.println("Checking Original Data Structure");
        // Not modify the original data structure just used for stream purpose
        list.stream().forEach(System.out::println);

        System.out.println("all elements which are greater than 2 and less han 5");
        // Print all element which is greater than 2 and less han 5
        list.stream().filter(s -> s>2 && s<5).forEach(System.out::println);


        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Manish",22,"India"));
        persons.add(new Person("Ravi",29,"India"));
        persons.add(new Person("Kusum",24,"India"));
        persons.add(new Person("Zoya",18,"London"));
        persons.add(new Person("Maya",23,"UK"));

        System.out.println("IsEligibal for Voting (Country India)");
        persons.stream().filter(p -> p.getAge()>18).forEach(s -> System.out.println(s.getName()+", Age:"+s.getAge()));
        System.out.println("");

        persons.add(new Person("ManishAged",65,"India"));
        persons.add(new Person("RaviAged",55,"India"));
        persons.add(new Person("KusumAged",45,"India"));
        persons.add(new Person("ZoyaAged",72,"London"));
        persons.add(new Person("MayaAged",23,"UK"));

        System.out.println("IsEligibal for Retirement (Country India)");
        persons.stream().filter(p -> p.getAge()>60).filter(p -> p.getCountry().equals("India")).forEach(s -> System.out.println(s.getName()+", Age:"+s.getAge()));

    }
}
