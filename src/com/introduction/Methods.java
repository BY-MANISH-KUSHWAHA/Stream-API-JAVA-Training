package com.introduction;

public class Methods implements Company{
    // Default Methods


    @Override
    public void insertCompany() {
        System.out.println("Inserting a Company.");
    }

    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.insertCompany();
        obj.updateCompany();
    }
}

