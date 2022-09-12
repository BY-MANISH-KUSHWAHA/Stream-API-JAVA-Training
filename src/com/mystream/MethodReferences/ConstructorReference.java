package com.mystream.MethodReferences;

import java.util.ArrayList;
import java.util.List;

class Company1{
    String companyName;

    Company1(String companyName){
        this.companyName = companyName;

    }

    public String getCompanyName() {
        return companyName;
    }


    @Override
    public String toString(){
        return "Company{"+"\n"+"\t"+"\t"+
                "Company Name = '"+companyName+'\''+"\n"+"\t"+"\t"+
                "}";
    }
}
public class ConstructorReference {
    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

        lst.add("Amanon");
        lst.add("Google");
        lst.add("Microsoft");
        lst.add("Meta");
        lst.add("Uber");

        // Constructor Object Method Reference
        System.out.println("Company1::new");
        lst.stream().map(Company1::new ).forEach(System.out::println);
        // System.out::println ==> Method Reference =Type=> {Arbitary Reference} (Public method) (not static)

        System.out.println("name -> new Company1(name)");
        // Without Constructor Object Reference
        lst.stream().map(name -> new Company1(name)).forEach(System.out::println);



    }
}
