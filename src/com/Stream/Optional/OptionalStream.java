package com.Stream.Optional;


import java.util.*;
import java.util.HashMap;

public class OptionalStream {
    static Map<Integer, Person> personMap = new HashMap<>();

    public Person getPerson(Integer personId) {
        return personMap.get(personId);
    }

    public Optional<Person> getPersonOptional(Integer personId) {
        return Optional.ofNullable(personMap.get(personId));
    }

    public static void addPerson(Integer personId,Person p1){
        personMap.put(personId,p1);
    }

    public static void main(String[] args) {
        OptionalStream check = new OptionalStream();

        // return Person with some ID in Null Map
        Person p1 = check.getPerson(32);

        System.out.println(p1);
        try {
            p1.getAge();
        }
        catch(Exception e) {
            System.out.println("No Person found without Optional");
        }
        // Add some Person with some ID
        addPerson(32,new Person("Manish"));

        // some Person with some ID
        Person p2 = check.getPerson(32);

        System.out.println(p2);

        System.out.println("------- Using Optional Class ---------");
        // To overcome the Null point Exception:
        Optional<Person> p3 = check.getPersonOptional(2);

        if(p3.isPresent()){
            System.out.println(p3);
        }
        else{
            System.out.println("No Person found ");
        }

        // Empty()
        Optional<Person> p4 = check.getPersonOptional(2);
        // Pending




    }

}

// Empty() Method ==> whether optional object does contain a null value or not
// Of() Method
// ofNullable()

class Person {
    private String name;
    private int age;
    private String country;


    public Person(String name){
        this.name = name;
    }
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

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person{"+
                "name:'"+name+'\''+
                ", age:"+age+
                ", country:'"+country+'\''+
                "}";
    }
}

