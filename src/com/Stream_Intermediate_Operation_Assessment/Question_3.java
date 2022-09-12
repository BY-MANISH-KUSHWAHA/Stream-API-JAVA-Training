package com.Stream_Intermediate_Operation_Assessment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Question_3 {

    public static String CatchFirstChar(List<String> Word){
        String ans = "";
        for (String word:
             Word) {


            ans+=word.substring(0,1);
        }
        return ans;
    }


    public static void main(String[] args) {

        String Input = "How are You Manish kumar Kushwaha.";


        List<String> InputList = Arrays.stream(Input.split(" ")).collect(Collectors.toList());

        //String[] inputWords = inputString.split(" ");
        //String output = Arrays.stream(inputString.split("\\s+")).map(t -> t.substring(0, 1)).collect(Collectors.joining(""));
        //System.out.println(output);

        System.out.println("CatchFirstChar: "+CatchFirstChar(InputList));


    }
}
