package com.Function_Interface_Assessment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static com.Function_Interface_Assessment.Predicate_two_list.TwoStringListEqual;
import static com.Function_Interface_Assessment.Predicate_two_list.TwoStringListEqual_without_Sorting;

public class Comparator {

    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Ravi");
        s1.add("Manish");
        s1.add("Kusum");
        s1.add("Hriti");


        ArrayList<String> s2 = (ArrayList<String>) s1.clone();
        Collections.sort(s2);

        System.out.println("0th Trail");
        System.out.println(s1);
        System.out.println(s2);




        System.out.println(TwoStringListEqual_without_Sorting(s1,s2));
        int index=1;
        while(! TwoStringListEqual_without_Sorting(s1,s2)){
            System.out.println(index+" Trail");
            System.out.println(s1);
            System.out.println(s2);
            Collections.shuffle(s1,new Random());
            System.out.println(TwoStringListEqual_without_Sorting(s1,s2));
            index++;

        }

        //while()Collections.sort(persons, (o1, o2) -> o1.getName().compareTo(o2.getName()));

    }
}
