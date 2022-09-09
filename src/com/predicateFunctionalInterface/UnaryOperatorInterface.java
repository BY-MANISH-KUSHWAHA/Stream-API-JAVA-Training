package com.predicateFunctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {


    public static void main(String[] args) {
        Person person = new Person("Manish",22,"India");
        UnaryOperator<Person> uo = (p) -> {
            p.name = "Manish Kushwaha";
            p.age = 20;
            p.country = "India";
                    return p;
        };

        uo.apply(person);

        System.out.println("Person Name:"+person.getName()+" ,Person Age:"+person.getAge());

    }
}
