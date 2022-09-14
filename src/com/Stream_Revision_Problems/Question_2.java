package com.Stream_Revision_Problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Stream;



public class Question_2 {
    public int countVowels(String word){



        return 0;
    }
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Manish",25));
        persons.add(new Person("Manish Kumar",25));
        persons.add(new Person("Arjun",5));
        persons.add(new Person("Shubham",15));
        persons.add(new Person("Pratham",20));

        Optional<Person> ans = persons.stream().collect(Collectors.maxBy(Comparator.comparing(Person::getVotes))).stream().findFirst();
        System.out.println("Subham Answer: "+ans);
        //maxBy
        Optional<Person> maxVotedPerson = persons.stream().collect(Collectors.maxBy(Comparator.comparing(Person::getVotes)));
        if(maxVotedPerson.isPresent()){
            boolean anyWinner = persons.stream().anyMatch(s -> s.getVotes()==maxVotedPerson.get().getVotes());
            if(anyWinner){
                System.out.println("Winner, Name: "+maxVotedPerson.get().getName()+" , Votes: "+maxVotedPerson.get().getVotes());
            }
            else{
                System.out.println("Loss, Name: "+maxVotedPerson.get().getName()+" , Votes: "+maxVotedPerson.get().getVotes());
            }

        }
        else{
            System.out.println("No data found!");
        }






    }
}

class Person{
    String name;
    int votes;

    public Person(String name, int votes) {
        this.name = name;
        this.votes = votes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", votes=" + votes +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getVotes() {
        return votes;
    }
}

