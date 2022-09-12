package com.Stream.MethodReferences;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Company{
    String companyName;
    int year;

    Company(String companyName,int year){
        this.companyName = companyName;
        this.year = year;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString(){
        return "Company{"+"\n"+"\t"+"\t"+
                "Company Name = '"+companyName+'\''+"\n"+"\t"+"\t"+
                "Company Year = "+year+"\n"+"\t"+"\t"+
                "}";
    }
}

public class ArbitaryReferences {
    public static void main(String[] args) {
        Company company = new Company("Amazon",75);
        System.out.println(" ");
        System.out.println(company);

        List<Company> lst = new ArrayList<>();
        lst.add(new Company("Amazon",54));
        lst.add(new Company("QuadEye",25));
        lst.add(new Company("Microsoft",45));
        lst.add(new Company("Google",32));

        // Getting the year of the company in a stream
        int totalNumberOfYear = lst.stream().map(s->s.getYear()).collect(Collectors.summingInt(Integer::intValue));
        System.out.println("totalNumberOfYear: "+totalNumberOfYear);

        System.out.println("----------------------");
        // Method Reference
        int totalNumberOfYearMethodReference = lst.stream().map(Company::getYear).collect(Collectors.summingInt(Integer::intValue));
        System.out.println("totalNumberOfYearMethodReference: "+totalNumberOfYearMethodReference);



    }
}
