package com.company.tapos;


public class SalaryPlusCommisionEmployee {
    private String firstName;
    private String lastName;
    private double salary;
    private double commisionRate;
    private double totalSell;

    public SalaryPlusCommisionEmployee(String firstName, String lastName, double salary, double commisionRate, double totalSell) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.commisionRate = commisionRate;
        this.totalSell = totalSell;
    }

    public String getFullName() {
        return this.firstName + " " + this.lastName;
    }

    public double getEarning() {
        return this.salary + (this.commisionRate * this.totalSell) / 100;
    }
}


