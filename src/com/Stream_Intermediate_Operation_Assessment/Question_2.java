package com.Stream_Intermediate_Operation_Assessment;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Question_2 {
    public static int PosSum(ArrayList<Integer> list){

        Stream<Integer> stream = list.stream().filter(s -> s > 0);
        ArrayList<Integer> arrayList = stream.collect(Collectors.toCollection(ArrayList::new));

        int ans=0;
        for (Integer I:
             arrayList) {
            ans=ans+I;
        }



        return ans;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(5);
        list.add(-1);
        list.add(-2);
        list.add(0);
        list.add(-4);
        list.add(-5);

        //list.stream().filter(s -> s>0).map(s -> )
        //https://www.baeldung.com/java-stream-sum
        System.out.println("PosSum of list: "+PosSum((ArrayList<Integer>) list));
    }
}
