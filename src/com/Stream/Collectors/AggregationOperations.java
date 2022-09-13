package com.Stream.Collectors;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AggregationOperations {
    // Aggregate Operation is real Operation

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Manish",29,44000,"India"));
        persons.add(new Person("Manish1",34,34000,"Ireland"));
        persons.add(new Person("Manish2",45,44000,"London"));
        persons.add(new Person("Manish3",59,54000,"India"));
        persons.add(new Person("Manish4",69,64000,"Dubai"));
        persons.add(new Person("Manish5",79,74000,"Pak"));


        // Counting
        long count = persons.stream().filter(emp -> emp.getAge()>35).collect(Collectors.counting());
        System.out.println("Number of person greater than 35: "+count);

        // Summing
        long totalSalary = persons.stream().collect(Collectors.summingLong(emp -> emp.salary));
        System.out.println("Total Salary: "+totalSalary);

        // ToIntFunction
        double averageSalary = persons.stream().collect(Collectors.averagingInt(emp -> emp.salary));// Salary in double
        double DoubleAverageSalary = persons.stream().collect(Collectors.averagingDouble(emp -> emp.salary));// Salary in double
        System.out.println("Avg Salary: "+averageSalary);

        //minBy
        Optional<Person> minSalaryPerson = persons.stream().collect(Collectors.minBy(Comparator.comparing(Person::getSalary)));
        System.out.println("Person with minSalary:"+minSalaryPerson);

        //Person less than 30 and min Salary
        Optional<Person> minSalaryPersonlessThan30 = persons.stream().filter(emp->emp.getAge()<30).collect(Collectors.minBy(Comparator.comparing(Person::getSalary)));
        System.out.println(minSalaryPersonlessThan30);

        //maxBy
        Optional<Person> maxSalaryPerson = persons.stream().collect(Collectors.maxBy(Comparator.comparing(Person::getSalary)));
        System.out.println("Person with maxSalary:"+maxSalaryPerson.get());

        // Joining
        String JoinAString = Stream.of("I","am","Arjun").collect(Collectors.joining(" "));
        System.out.println(JoinAString);

        // Joining Object Specific String Variable
        String JoinAStringName = persons.stream().map(emp -> emp.getName()).collect(Collectors.joining(", "));
        System.out.println(JoinAStringName);




    }

}
