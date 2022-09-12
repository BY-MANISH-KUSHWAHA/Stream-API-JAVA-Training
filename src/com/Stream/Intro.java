package com.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Intro {
    public static void main(String[] args) {
        Stream<Integer>  checkStream = Stream.of(3,4152,12,1,2,3);
        checkStream.forEach(s-> System.out.println(s));
        System.out.println("");

        List<String> list = new ArrayList<>();
        list.add("H");
        list.add("E");
        list.add("L");
        list.add("L");
        list.add("O");

        Stream<String> checkStreamList = list.stream();
        checkStreamList.forEach(s-> System.out.println(s));




    }
}
