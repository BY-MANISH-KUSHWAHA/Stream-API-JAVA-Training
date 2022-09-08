package com.introduction;

public interface Company {
    void insertCompany();
    default void updateCompany(){
        System.out.println("Call from Interface: Updating the company Details (without extends we have a parent method)");
    }

    static  void deleteCompany(){
        System.out.println("I'm deleting the company details.");
    }
}
