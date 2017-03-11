package com.company.tapos;


public class SalaryEmployee {
    private String firstName;
    private String lastName;
    private double salary;

    public SalaryEmployee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFullName(){
        return this.firstName + " "+ this.lastName;
    }

    public double getEarning(){
        return this.salary;
    }
}
