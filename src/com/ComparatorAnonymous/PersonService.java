package com.ComparatorAnonymous;
import java.util.*;
public class PersonService {
    public static List<Person> getPerson(List<Person> persons){
        Collections.sort(persons,new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

        return persons;
    }
}
