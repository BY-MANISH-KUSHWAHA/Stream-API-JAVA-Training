package com.introduction;

@FunctionalInterface
public interface FunctionInterfaceExample {
    void printing();
    
    default public void printing2(){

    }
    // Give error because we can only make one abstract method: void printing3();
}
