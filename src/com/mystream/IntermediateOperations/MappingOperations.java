package com.mystream.IntermediateOperations;

import com.mystream.Intro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MappingOperations {
    public static void main(String[] args) {
        // List of Integer
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(5);

        System.out.println("Multiply all elements with 2 in Stream");
        list.stream().map(s -> s*2).forEach(System.out::println);

        System.out.println("Checking Original Data Structure");
        // Not modify the original data structure just used for stream purpose
        list.stream().forEach(System.out::println);

        // Array of String try to return new Array of String that inclueds thoes character <5
        // and change all of the Array of String to uppercase

        List<String> names = new ArrayList<>();
        names.add("Arjun");
        names.add("Manish");
        names.add("Nitin");
        names.add("Arya");
        names.add("Arjun");
        names.add("ok");

        Stream<String> stream = names.stream().filter(s -> s.length() < 5).map(s -> s.toUpperCase());
        ArrayList<String> arrayList = stream.collect(Collectors.toCollection(ArrayList::new));
        System.out.println(arrayList);


        // MaptoInt
        List<String> strlist = new ArrayList<>();
        strlist.add("1");
        strlist.add("2");
        strlist.add("0");
        strlist.add("4");
        strlist.add("5");

        strlist.stream().mapToInt(s -> Integer.parseInt(s)).forEach(s-> System.out.println((s<4)+" <4 "+s));

        names.stream().mapToInt(s -> s.length()).forEach(s-> System.out.println(s));

        // Flattening a stream

        System.out.println("2D Array we always use flatmap insteam of map");
        List<List<String>> TwoDlist = new ArrayList<>();
        TwoDlist.add(Arrays.asList("a","b","c"));
        TwoDlist.add(Arrays.asList("d","e","f"));
        TwoDlist.add(Arrays.asList("g","a","i"));
        TwoDlist.add(Arrays.asList("k","l","m"));
        TwoDlist.add(Arrays.asList("n","o","a"));

        // Not working we check as 1d but its a 2d list and our desire element in inside nested array
        Stream<List<String>> normalStream = TwoDlist.stream().filter(s -> "a".equals(s));
        normalStream.forEach(System.out::println);

        // Flattening Stream
        Stream<String> flattendedStream = TwoDlist.stream().flatMap(s -> s.stream());

        // Filetring Operatoin
        Stream<String> streamFiltered = flattendedStream.filter(chr -> "a".equals(chr)).map(s -> s+" - flatmap.filter");

        //expectedOutpur: a
        streamFiltered.forEach(System.out::println);


    }
}
