package com.Stream_Revision_Problems;

import java.util.ArrayList;
import java.util.List;

public class Question_4 {
    public static void main(String[] args) {
        List<String> Listwords = new ArrayList<>();
        Listwords.add("Manish");
        Listwords.add("Kumar");
        Listwords.add("Kushwaha");
        Listwords.add("Arjun");
        Listwords.add("Sharmaa"); // 11 vowels
        //exampleString.chars().filter(ch -> ch != ' ').count()


        long totalvoewls_char = Listwords.stream().flatMap(s -> s.chars()
                        .mapToObj(c -> (char) c))
                .filter(c -> c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                .count();
        System.out.println(totalvoewls_char);


        int totvowel = Listwords.stream()
                .map(s -> s.length()-s.replaceAll("[aeiou]", "").length())
                .reduce(0, Integer::sum);
        System.out.println(totvowel);
    }
}

