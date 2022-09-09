package com.Stream_Intermediate_Operation_Assessment;

import java.util.ArrayList;
import java.util.List;

public class Question_1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(5);
        System.out.println("Original List");
        list.stream().forEach(System.out::println);


        System.out.println("Square the values of list");
        list.stream().map(s -> s*s).forEach(System.out::println);
    }
}
