package com.Stream.Collectors.CollectionsOperations;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionOperations {
    public static void main(String[] args) {
        // 1. Collect Method
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Manish",29,44000,"India"));
        persons.add(new Person("Manish1",34,34000,"Ireland"));
        persons.add(new Person("Manish2",45,44000,"London"));
        persons.add(new Person("Manish3",59,54000,"India"));
        persons.add(new Person("Manish4",69,64000,"Dubai"));
        persons.add(new Person("Manish5",79,74000,"Pak"));

        // List
        List<String> names = persons.stream().map(person -> person.getName()).collect(Collectors.toList());
        System.out.println("Names: "+names);
        // Set
        Set<String> countries = persons.stream().map(person -> person.getCountry()).collect(Collectors.toSet());
        System.out.println("Unique Country Name: "+countries);

        // Linked List
        LinkedList<String> llnamePerson = persons.stream().map(s -> s.getName()).collect(Collectors.toCollection(LinkedList::new));
        System.out.println("ll Person Name: "+llnamePerson);

        // TreeSet
        TreeSet<String> tsnamePerson = persons.stream().map(s -> s.getName()).collect(Collectors.toCollection(TreeSet::new));
        System.out.println("ts Person Name: "+tsnamePerson);

        // ArrayList
        ArrayList<String> alnamePerson = persons.stream().map(s -> s.getName()).collect(Collectors.toCollection(ArrayList::new));
        System.out.println("al Person Name: "+alnamePerson);


        // Map
        Map<String,Integer> mapnamePerson = persons.stream().collect(Collectors.toMap(s->s.getName(),s->s.getSalary()));
        System.out.println("Map Person Name with Salary: "+mapnamePerson);

        // Downstream

        List<String> notChangableList = persons.stream().map(s-> s.getName()).collect(Collectors.collectingAndThen(Collectors.toList(),Collections::unmodifiableList));
        System.out.println(notChangableList);

        // Error
        // => notChangableList.add();
        /*
        java: no suitable method found for add(no arguments)
            method java.util.List.add(java.lang.String) is not applicable
              (actual and formal argument lists differ in length)
            method java.util.List.add(int,java.lang.String) is not applicable
              (actual and formal argument lists differ in length)
         */


    }
}

class Person {
    String name;
    int age;
    int salary;

    String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Person(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public Person(String name, int age, int salary,String country){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return "Person{"+
                "Name:'"+name+'\''+
                ", Age:"+age+
                "Country:'"+country+'\''+
                ", Salary:"+salary+
                "}";
    }


}

