package com.youtube;

public class Main {
    public static void main(String[] args) {
        //static (and instance) methods & fields
        Employee employee1 = new Employee(50_000,20);
        new Employee(50_000);
        new Employee(30_000);
        new Employee(10_000);
        Employee.printNumberOfEmployees();
        int wage = employee1.calculateWage();
        System.out.println(wage);
    }
}



package com.youtube;

public class Employee {
    //static (and instance) methods & fields
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;


    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }
    public Employee(int baseSalary){
        this(baseSalary,0); //this will pass the data into above public Employee(int baseSalary, int hourlyRate){}
    }

    public static void printNumberOfEmployees(){
        System.out.println(numberOfEmployees);
    }


    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
    public int calculateWage(){
        return calculateWage(0); //this will pass the data into above method public int calculateWage(int extraHours){}
    }

    private void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Base salary can not be 0 or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }
    private void setHourlyRate(int hourlyRate){
        if(hourlyRate < 0)
            throw new IllegalArgumentException("Hourly Rate can not be less than 0");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }
}
