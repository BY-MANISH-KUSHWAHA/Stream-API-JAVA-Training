package com.Stream.Collectors;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingOperation {
    public static void main(String[] args) {
        // Grouping
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Manish",25,44000,"India"));
        persons.add(new Person("Manish1",25,34000,"Ireland"));
        persons.add(new Person("Manish2",35,44000,"London"));
        persons.add(new Person("Manish3",12,54000,"India"));
        persons.add(new Person("Manish4",12,64000,"Dubai"));
        persons.add(new Person("Manish5",12,74000,"Pak"));

        // GroupBy Age
        Map<Integer,List<Person>> listMap = persons.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(listMap);

        // GroupBy Country with Single Max Salary Person.
        Map<String, Optional<Person>> listMap_SinglePersonWithMaxSalary = persons.stream().collect(Collectors.groupingBy(Person::getCountry, Collectors.maxBy(Comparator.comparingInt(Person::getSalary))));
        System.out.println(listMap_SinglePersonWithMaxSalary);






    }
}
