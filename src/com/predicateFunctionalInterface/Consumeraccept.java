package com.predicateFunctionalInterface;

import java.util.function.Consumer;

public class Consumeraccept {
    public static void main(String[] args) {
        Consumer<String> stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Hello how are you");

        Consumer<Integer> integerConsumer = i -> System.out.println("Interger Value: "+i);
        integerConsumer.accept(5);

        Consumer<String> employee1 = (arg) -> System.out.println(arg+ ", My name is Arjun ");

        Consumer<String> employee2 = (arg) -> System.out.println(arg+", I am from India ");

        employee1.andThen(employee2).accept("Hello");

    }
}
