package com.Stream.ParallelStreams;

import java.util.stream.Stream;

public class Stream1 {

    public static void main(String[] args) {
        System.out.println("Printing General Stream");
        Stream.of(1,2,3,4,5,6,7).forEach(num -> System.out.println(num + ", ThreadName:"+ Thread.currentThread().getName()+", ThreadId:"+Thread.currentThread().getId()));
        System.out.println("Parallel Stream");
        Stream.of(1,2,3,4,5,6,7)
                .parallel()
                .forEach(num -> System.out.println(num + ", ThreadName:"+ Thread.currentThread().getName()+", ThreadId:"+Thread.currentThread().getId()));


    }
}
