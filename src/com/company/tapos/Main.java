package com.company.tapos;

public class Main {

    public static void main(String[] args) {
	// write your code here
        SalaryEmployee salaryEmployee = new SalaryEmployee("md","sumon",5000);
        System.out.println(salaryEmployee.getFullName());
        System.out.println(salaryEmployee.getEarning());

        System.out.println("=========================");


        ComissionEmployee comissionEmployee = new ComissionEmployee("md","karim",5,10000);
        System.out.println(comissionEmployee.getFullName());
        System.out.println(comissionEmployee.getEarning());


        System.out.println("=========================");





        SalaryPlusCommisionEmployee salaryPlusCommisionEmployee = new SalaryPlusCommisionEmployee("md","karim",20000,5,10000);
        System.out.println(salaryPlusCommisionEmployee.getFullName());
        System.out.println(salaryPlusCommisionEmployee.getEarning());


        System.out.println("=========================");
    }
}
