package com.Stream.ImmutableOperations;

import java.util.ArrayList;
import java.util.*;
public class ReductionOperations {

    // Reduce => Collection of Object => Gives a Signle Valued Result which is Immtable
    // Identity => Initial value of the operation => default result => when your stream is empty
    // Accumulator => a,b => a[partial result] +b [next element of the stream]
    // Combiner => types of accumulator implementation

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Manish",29,44000));
        persons.add(new Person("Manish1",34,34000));
        persons.add(new Person("Manish2",45,44000));
        persons.add(new Person("Manish3",59,54000));
        persons.add(new Person("Manish4",69,64000));
        persons.add(new Person("Manish5",79,74000));


        // 1. Optional<T>reduce(BinaryOperator<T>accumulator)
        Optional<Integer> totalSalary = persons.stream().map(s -> s.getSalary()).reduce((p,q)->p+q);

        if(totalSalary.isPresent()){
            System.out.println("The Total Salary of all people:"+totalSalary.get());

        }
        else{
            System.out.println("No Records found.");
        }

        //2. T reduce(T identity, BinaryOperator<T>accumulator)
        List<Integer> intList = new ArrayList<>();
        //intList.add(-3);
        //intList.add(-2);
        //intList.add(-1);
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(3);

        int totalSum = intList.stream().reduce(10,(p1,n)->p1+n);
        System.out.println("10+TotalSum:"+totalSum);

        totalSum = intList.stream().reduce(9,(p1,n)->p1+n);
        System.out.println("9+TotalSum:"+totalSum);

        // 3. Combiner with Parallel Streams
        /*
        1-> Stream -> 1.1 Stream -> 1.2 Stream -> 1.3 Stream
        // Stream -> Payroll[Jan + Feb + Mar] Combiner
        // Sub Streams -> Jan[Sub] -> Number of Days -> Feb[Sub] -> Number of Days-> Mar[Sub] -> Number of Days.
         */

        int totalSum2 = intList.parallelStream().reduce(4,(partialSum,num)->partialSum+num,Integer::sum);
        System.out.println("(parallelStream)=>2+TotalSum:"+totalSum2);
        //        intList.add(0);
        //        intList.add(1);
        //        intList.add(2);
        //        intList.add(3);
        // Expected Output: identity * listlength + actual Sum
        // OR -|
        // 4 tread, But since the reduce operation is handled in parallel, the identity number actually gets added up in every worker thread:
        // 4+num[0] + 4+num[1] + 4+num[2] + 4+num[3]
        // 4+0      + 4+1      + 4+2      + 4+3
        // 4        + 5        + 6        + 7
        // 4+5+6+7
        // 22


        // 4. Max and Min => First sort than return max at natural order and min at reverse order
        Optional<Integer> maxNum = intList.stream().max(Comparator.naturalOrder());
        System.out.println("Max Num:"+maxNum);
        // Natural Order last node => 0->1->2->3 => 3
        Optional<Integer> LastMaxNum = intList.stream().max(Comparator.reverseOrder());
        System.out.println("Last Max Num (Min):"+LastMaxNum);
        // Reverse Order fist node => 0->1->2->3 => 0

        Optional<Integer> minNum = intList.stream().min(Comparator.naturalOrder());
        System.out.println("Min Num:"+minNum);
        // Natural Order last node => 0->1->2->3 => 3
        Optional<Integer> LastminNum = intList.stream().min(Comparator.reverseOrder());
        System.out.println("Last Min Num (Max):"+LastminNum);
        // Reverse Order fist node => 0->1->2->3 => 0

        /*
        Both immutable and constant are keywords that can be used on state variables to restrict
        modifications to their state. The difference is that constant variables can never be
        changed after compilation, while immutable variables can be set within the constructor.
         */








    }
}

class Person {
    String name;
    int age;
    int salary;

    public Person(String name,int age,int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString(){
        return "Person{"+
                "Name:'"+name+'\''+
                ", Age:"+age+
                ", Salary:"+salary+
                "}";
    }


}


