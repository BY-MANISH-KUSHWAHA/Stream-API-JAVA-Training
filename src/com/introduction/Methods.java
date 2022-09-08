package com.introduction;

public class Methods implements Company,Tata,Mahindra{
    // Default Methods




    // Abstract Method
    @Override
    public void insertCompany() {
        System.out.println("Inserting a Company.");
    }
    // Default method is being overidden
    @Override // can be override or used interface one
    public void updateCompany(){
        System.out.println("Call from implemented class");
    }

    // Abstract Method
    @Override
    public void display() {
        System.out.println("Implemented at node class(Implemented class)");
    }

    public static void main(String[] args) {
        Methods obj1 = new Methods();
        obj1.insertCompany();
        obj1.updateCompany();

        Methods obj2 = new Methods();
        obj2.insertCompany();
        obj2.updateCompany();

        // Static method
        Company.deleteCompany();



    }
}

