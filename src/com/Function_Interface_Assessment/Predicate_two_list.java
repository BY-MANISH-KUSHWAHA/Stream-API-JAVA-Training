package com.Function_Interface_Assessment;

import com.predicateFunctionalInterface.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Predicate_two_list {

    static boolean TwoStringEqual(String p1, String p2, BiPredicate<String,String> predicate){
        return predicate.test(p1,p2);
    }

    static  boolean TwoStringListEqual(ArrayList<String> s1, ArrayList<String> s2){
        boolean ans = true;
        if(s1.size()!=s2.size()){
            return false;
        }
        Collections.sort(s1);
        Collections.sort(s2);

        for (int i = 0; i < s1.size(); i++) {
            String p1 = s1.get(i);
            String p2 = s2.get(i);
            boolean eligible_ = TwoStringEqual(p1,p2,(p1_,p2_)->{
                return p1_.equals(p2_); // call back function.(define function after calling --> called as call back function)

            });
            ans = ans && eligible_;
        }
        return ans;
    }

    static  boolean TwoStringListEqual_without_Sorting(ArrayList<String> s1, ArrayList<String> s2){
        boolean ans = true;
        if(s1.size()!=s2.size()){
            return false;
        }

        for (int i = 0; i < s1.size(); i++) {
            String p1 = s1.get(i);
            String p2 = s2.get(i);
            boolean eligible_ = TwoStringEqual(p1,p2,(p1_,p2_)->{
                return p1_.equals(p2_); // call back function.(define function after calling --> called as call back function)

            });
            ans = ans && eligible_;
        }
        return ans;
    }

    static boolean IsTwoStringListEqual(ArrayList<String> p1, ArrayList<String> p2, BiPredicate<ArrayList<String>,ArrayList<String>> predicate){
        return predicate.test(p1,p2);
    }

    public static void main(String[] args) {
        ArrayList<String> s1 = new ArrayList<>();
        s1.add("Manish");
        s1.add("Ravi");

        ArrayList<String> s2 = new ArrayList<>();
        s1.add("Ravi");
        s1.add("Kusum");

        ArrayList<String> s3 = (ArrayList<String>) s1.clone();

        // Predicate Test


        System.out.println(TwoStringListEqual(s1,s3));
        System.out.println(TwoStringListEqual(s1,s2));




    }
}
