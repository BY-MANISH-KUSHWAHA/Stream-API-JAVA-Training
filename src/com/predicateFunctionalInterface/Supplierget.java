package com.predicateFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Supplierget {
    static boolean isPersonEligibleForVoting(Supplier<Person> supplier, Predicate<Person> predicate){
        return predicate.test(supplier.get());
    }


    static ArrayList<Boolean> isPersonsEligibleForVoting(Supplier<ArrayList<Person>> suppliers, Predicate<Person> predicate){
        ArrayList<Boolean> booleans = new ArrayList<>();
        for(Person person: suppliers.get()){
            Supplier<Person> supplier = () -> person;
            booleans.add(isPersonEligibleForVoting(supplier,predicate));
        }
        return booleans;
    }
    public static void main(String[] args) {
        Supplier<Person> supplier = () -> new Person("Manish",22,"India");
        Predicate<Person> predicate = (p) -> p.getAge() > 18;

        boolean eligible = isPersonEligibleForVoting(supplier,predicate);

        System.out.println("Person eligible for volting: "+eligible);

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Manish",22,"New York"));
        persons.add(new Person("Ravi",18,"India"));
        persons.add(new Person("Kusum",66,"India"));
        persons.add(new Person("Zoya",16,"London"));
        persons.add(new Person("Maya",23,"UK"));

        Supplier<ArrayList<Person>> suppliers = () -> (ArrayList<Person>) persons;
        ArrayList<Boolean> eligibles = isPersonsEligibleForVoting(suppliers, predicate);
        for(int i=0; i<persons.size(); i++){
            System.out.println(persons.get(i).getName()+" is Eligible for voting(Using Supplier): "+eligibles.get(i)+", age:"+persons.get(i).getAge());

        }
        System.out.println("");




    }

}
