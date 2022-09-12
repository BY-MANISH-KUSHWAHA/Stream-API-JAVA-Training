package com.Stream.MethodReferences;

import java.util.ArrayList;
import java.util.List;

public class Static_And_Instance {
    public static int getLength(String str){
        return str.length();
    }

    public int GeneralgetLength(String str){
        return str.length();
    }



    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();
        lst.add("Manish");
        lst.add("Ravi");
        lst.add("Kusum");
        lst.add("Zaya");
        lst.add("Vishal");

        System.out.println("General Method Reference");
        // General Static Methods:  Using MethodReferences used our own fnx
        lst.stream().map(s -> Static_And_Instance.getLength(s)).forEach(System.out::println);

        System.out.println("Static Method Reference");
        // Static Method Reference
        lst.stream().map(Static_And_Instance::getLength).forEach(System.out::println);

        //General Static Mthod
        Static_And_Instance obj = new Static_And_Instance();
        System.out.println("Using Object -> General Method Reference");
        lst.stream().map(s -> obj.getLength(s)).forEach(System.out::println);

        System.out.println("Using Object -> Static Method Reference");
        // Static Method Reference
        lst.stream().map(obj::GeneralgetLength).forEach(System.out::println);


    }
}

/*
Static Method Reference: ClassName::StaticMethodName

Instance Method Reference: System.out::println

Arbitrary object Reference: ClassName::InstanceMethodName (InstanceMethodName means method without "()" )
    example: Company::GetYear{Right} ||| Comapny::GetYear() {X}
--------------------------------------------------
Constructor Reference:

    Example: If we have Only Student Name and we want to make student Object using their name

    We can use the method reference with the new keyword, which is called as Constructor reference.
        List studentList = studentNames.stream().map(Student::new)
                .collect(Collectors.toList());
    equivalent lambda expression
        List studentList = studentNames.stream()
                .map(name -> new Student(name)).collect(Collectors.toList());

 */
