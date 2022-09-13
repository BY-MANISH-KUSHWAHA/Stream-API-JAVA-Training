package com.predicateFunctionalInterface;

import java.util.function.Supplier;

public class SupplierUsage {
    static String name = "Manish";

    public static void main(String[] args) {



        Employee emp1 = new Employee("Manish",22);
        System.out.println(emp1.getName());
        Payroll payroll = new Payroll("Manish",22);
        System.out.println(payroll.getName());

        Supplier<Employee> employeeSupplier = () -> new Employee("Arjun",18);
        Supplier<Payroll> payrollSupplier = () -> new Payroll("Arjun",18);





        Supplier<Integer> integerSupplier = () -> name.length();
        Supplier<Boolean> booleanSupplier = () -> name.length() ==4 ;
        Supplier<String> stringSupplier = () -> name.toString();
        System.out.println(integerSupplier);
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

class Payroll{
    private String name;
    private int age;

    public Payroll(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}




