package com.mystream.IntermediateOperations;

import java.util.ArrayList;
import java.util.List;

public class FilteringOperation {
    public static void main(String[] args) {
        // List of Integer
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(5);

        // Print all element which is greater than 2
        list.stream().filter(s -> s>2).forEach(System.out::println);

        System.out.println("Checking Original Data Structure");
        // Not modify the original data structure just used for stream purpose
        list.stream().forEach(System.out::println);


    }
}
