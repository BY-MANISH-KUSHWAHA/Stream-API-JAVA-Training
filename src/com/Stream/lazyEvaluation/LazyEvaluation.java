package com.Stream.lazyEvaluation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LazyEvaluation {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,2,3,3,5,4,8,12,16,18);
        Optional<Integer> numbers = data.stream()
                .filter(num -> {
                    System.out.println("First_Filter(greater than 3): "+num);
                    return num>3;
                })
                .filter(num -> {
                    System.out.println("Second_Filter(num is even): "+num);
                    return num%2==0;
                })
                .findFirst();
        System.out.println("Using General Stream: "+numbers.get());

        // Complete Randon due to parallel Stream. Not for FindFirst

        Optional<Integer> numbers_parallel = data.parallelStream()
                .filter(num -> {
                    System.out.println("FindFirst - Parallel_First_Filter(greater than 3): "+num+" ThreadName:"+Thread.currentThread().getName());
                    return num>3;
                })
                .filter(num -> {
                    System.out.println("FindFirst - Parallel_Second_Filter(num is even): "+num+" ThreadName:"+Thread.currentThread().getName());
                    return num%2==0;
                })
                .findFirst();
        System.out.println("FindFirst - Using Parallel Stream: "+numbers_parallel.get());

        // Complete Randon due to parallel Stream. Good for FindAny
        Optional<Integer> numbers_parallel_any = data.parallelStream()
                .filter(num -> {
                    System.out.println("FindAny - Parallel_First_Filter(greater than 3): "+num+" ThreadName:"+Thread.currentThread().getName());
                    return num>3;
                })
                .filter(num -> {
                    System.out.println("FindAny - Parallel_Second_Filter(num is even): "+num+" ThreadName:"+Thread.currentThread().getName());
                    return num%2==0;
                })
                .findAny();
        System.out.println("FindAny - Using Parallel Stream_any: "+numbers_parallel_any.get());

        // apply everything on each object and every
        data.stream()
                .filter(num -> {
                    System.out.println("ForEach_First_Filter(greater than 3): "+num);
                    return num>3;
                })
                .filter(num -> {
                    System.out.println("ForEach_Second_Filter(num is even): "+num);
                    return num%2==0;
                })
                .forEach(System.out::println);

        // Pick the first element => 1 => It is greater than 3
        // Pick the Second element => 2 => It is greater than 3
        // Pick the 3rd element => 3 => It is greater than 3
        // Pick the 4th element => 4 => It is greater than 3 => 4%2==0 => return first.
        // All Conditions are satisfies.
    }
}
