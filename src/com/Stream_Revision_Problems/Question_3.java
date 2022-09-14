package com.Stream_Revision_Problems;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question_3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("aasasu");
        words.add("a3423u");
        words.add("sa3423u");
        words.add("a3423us");
        words.add("sa3423us");

        List<String> ans3 = words.stream().filter(s -> s.charAt(0) == 'a').filter(s -> s.charAt(s.length()-1) == 'u' ).collect(Collectors.toList());
        System.out.println("Words with start at 'a' and end with 'u': "+ans3);


    }
}
