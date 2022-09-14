package com.Stream_Revision_Problems;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Quesion_5 {
    public static void main(String[] args) {
        List<Employee> emp = new ArrayList<>();
        emp.add(new Employee("Manish",22,99990));
        emp.add(new Employee("Kusum",26,25000));
        emp.add(new Employee("Ravi",30,41000));
        emp.add(new Employee("Hriti",18,30000));

        //minBy
        Optional<Employee> minSalaryPerson = emp.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Person with minSalary:"+minSalaryPerson);

        //maxBy
        Optional<Employee> maxSalaryPerson = emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Person with maxSalary:"+maxSalaryPerson);

        // Avg Salary
        double avgSalary = emp.stream().collect(Collectors.averagingInt(e -> e.getSalary()));
        System.out.println("AvgSalary:"+avgSalary);

        // Summing
        long summ = emp.stream().collect(Collectors.summingLong(e -> e.getSalary()));
        System.out.println("Sum of all Salary:"+summ);

        //maxBy-Age
        Optional<Employee> oldestPerson = emp.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
        System.out.println("Oldest Person :"+oldestPerson);


    }



}

class Employee{
    String Name;
    int Age;
    int Salary;

    public Employee(String name, int age, int salary) {
        Name = name;
        Age = age;
        Salary = salary;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return Age;
    }

    public int getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", Age=" + Age +
                ", Salary=" + Salary +
                '}';
    }
}
