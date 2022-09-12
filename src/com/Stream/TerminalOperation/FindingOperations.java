package com.Stream.TerminalOperation;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FindingOperations {
    public static void main(String[] args) {
        // Find First
        // FindAny

        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person("Manish",29,"India"));
        persons.add(new Person("Ravi",21,"Dubia"));
        persons.add(new Person("Kusum",18,"USA"));

        persons.add(new Person("Maya",16,"UK"));
        persons.add(new Person("Maya1",16,"UK"));
        persons.add(new Person("Maya2",16,"UK"));
        persons.add(new Person("Zoya",17,"UK"));

        System.out.println("Sample output without Optional");
        persons.stream().filter( p -> p.getCountry().equals("UK")).forEach(System.out::println);

        System.out.println("------------- Find First -----------------");
        Optional<Person> per = persons.stream().filter(p -> p.getCountry().equals("UK")).findFirst();

        if(per.isPresent()){
            System.out.println("Optional Object:"+per+"\n"+"Person Object(toString):"+per.get());
        }
        else{
            System.out.println("No Data find");
        }

        System.out.println("------------- Find ANY llr processing multiple tread -----------------");
        Optional<Person> perany = persons.stream().filter(p -> p.getCountry().equals("UK")).findAny();

        if(per.isPresent()){
            System.out.println("Optional Object:"+perany+"\n");
        }
        else{
            System.out.println("No Data find");
        }


    }
}

class Person {
    private String name;
    private int age;
    private String country;


    public Person(String name){
        this.name = name;
    }
    public Person(String name,int age,String country){
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Person{"+
                "Name:'"+name+'\''+
                ", Age:"+age+
                ", Country:'"+country+'\''+
                "}";
    }
}


