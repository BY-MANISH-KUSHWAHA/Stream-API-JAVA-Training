package com.predicateFunctionalInterface;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {
    static boolean isPersonEligibleVoting(Person person, Predicate<Person> predicate){
        return predicate.test(person);
    }
    static boolean isPersonEligibleVoting(Person person, Integer minAge, BiPredicate<Person,Integer>predicate){
        return predicate.test(person,minAge);
    }

    static ArrayList<Boolean> isPersonsEligibleVoting(ArrayList<Person> persons, Predicate<Person> predicate){
        ArrayList<Boolean> booleans = new ArrayList<>();
        for (Person person:
             persons) {
            booleans.add(predicate.test(person));
        }
        return booleans;
    }

    static ArrayList<Boolean> isPersonsEligibleForRetirement(ArrayList<Person> persons, Predicate<Person> predicate){
        ArrayList<Boolean> booleans = new ArrayList<>();
        for (Person person:
                persons) {
            booleans.add(predicate.test(person));
            //System.out.println(predicate.test(person));
        }
        return booleans;
    }

    public static void main(String[] args) {
        // predicate Test
        Person person_ = new Person("Manish",18,"India");

        Predicate<Person> predicate_ = p -> p.getAge()>18;

        boolean eligible_ = isPersonEligibleVoting(person_,18,(p,minAge)->{
            return p.getAge()>minAge;
        });

        System.out.println("is Person Eligible for voting(Using BiPredicate): "+eligible_);



        Person person = new Person("Manish",18,"India");

        // Predicate Test
        Predicate<Person> predicate = p -> p.getAge()>18;

        boolean eligible = isPersonEligibleVoting(person,predicate);

        System.out.println("is Person Eligible for voting: "+eligible);


        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Manish",22,"New York"));
        persons.add(new Person("Ravi",18,"India"));
        persons.add(new Person("Kusum",66,"India"));
        persons.add(new Person("Zoya",16,"London"));
        persons.add(new Person("Maya",23,"UK"));

        ArrayList<Boolean> eligibles = isPersonsEligibleVoting((ArrayList<Person>) persons,predicate);


        for(int i=0; i<persons.size(); i++){
            System.out.println(persons.get(i).getName()+" is Eligible for voting: "+eligibles.get(i)+", age:"+persons.get(i).getAge());

        }
        System.out.println("");

        // Predicate Test
        Predicate<Person> predicate_retirement = p -> p.getAge()>60;

        boolean eligibleForRetirement = isPersonEligibleVoting(person,predicate);


        ArrayList<Boolean> eligibles_retier = isPersonsEligibleForRetirement((ArrayList<Person>) persons,predicate_retirement);


        for(int i=0; i<persons.size(); i++){
            System.out.println(persons.get(i).getName()+" is Eligible for Retirement: "+eligibles_retier.get(i)+", age:"+persons.get(i).getAge());

        }

    }
}
