package com.Stream.IntermediateOperations;




import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class SlicingOperations {
    public static <T> Predicate<T> distinctByKey(
            Function<? super T, ?> keyExtractor) {

        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }
    public static void main(String[] args) {
        // Distinct Method
        //  Remove Duplicates
        List<String> names = new ArrayList<>();
        names.add("Arjun");
        names.add("Manish");
        names.add("Nitin");
        names.add("Arya");
        names.add("Arjun");
        names.add("Manish");
        // Slicing => (limit or skip) present

        System.out.println("Distinct-------");
        names.stream().distinct().forEach(System.out::println); // Print only Distinct/ Unique element from list

        // Limit
        System.out.println("Limit-----------");
        names.stream().distinct().limit(3).forEach(System.out::println);
        // Just find two unique element

        // Skip
        System.out.println("Skip------------");
        //limit upto 3 and than Skip first element
        names.stream().distinct().limit(3).skip(1).forEach(System.out::println);





        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Manish",22,"India"));
        persons.add(new Person("Ravi",29,"India"));
        persons.add(new Person("Kusum",24,"India"));
        persons.add(new Person("Zoya",18,"London"));
        persons.add(new Person("Manish",22,"India"));

        // We need to @Override ToString, Hashcode, and equals method
        persons.stream().distinct().forEach(System.out::println);

        System.out.println("------------");
        // or
        persons.stream().filter(distinctByKey(p -> p.getName()+"-"+p.getCountry()+"-"+ p.getAge())).collect(Collectors.toList()).forEach(System.out::println);





    }
}

class Person {
    String name;
    int age;
    String country;

    public Person(String name,int age,String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
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

    @Override
    public String toString(){
        return "Person{"+
                "Name:'"+name+'\''+
                ", Age:"+age+
                ", Country:'"+country+'\''+
                "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("Data equals method");
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (age != other.age)
            return false;
        if (!name.equals(other.getName()))
            return false;
        if (!country.equals(other.getCountry()))
            return false;

        return true;
    }


}
