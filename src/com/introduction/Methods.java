package com.introduction;

public class Methods implements Company{
    // Default Methods


    @Override
    public void insertCompany() {
        System.out.println("Inserting a Company.");
    }
    @Override // can be override or used interface one
    public void updateCompany(){
        System.out.println("Call from implemented class");
    }

    public static void main(String[] args) {
        Methods obj = new Methods();
        obj.insertCompany();
        obj.updateCompany();

        Methods obj_ = new Methods();
        obj_.insertCompany();
        obj_.updateCompany();

        // Call the static method
        Company.deleteCompany();



    }
}

