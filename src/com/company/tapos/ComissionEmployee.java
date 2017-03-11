package com.company.tapos;

public class ComissionEmployee {
    private String firstName;
    private String lastName;
    private double commissionRate;
    private double totalSell;

    public ComissionEmployee(String firstName, String lastName, double commissionRate, double totalSell) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.commissionRate = commissionRate;
        this.totalSell = totalSell;
    }

    public String getFullName(){
        return this.firstName + " "+ this.lastName;
    }

    public double getEarning(){
        return  (this.commissionRate * this.totalSell)/100;
    }
}
