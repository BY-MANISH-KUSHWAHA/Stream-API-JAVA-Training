package com.Stream.IntermediateOperations;

import java.util.ArrayList;
import java.util.List;

public class SlicingOperations {
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





    }
}
