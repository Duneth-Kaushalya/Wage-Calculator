package com.youtube;

public class Main {
    public static void main(String[] args) {
        //Abstraction and Coupling

        Employee employee1 = new Employee();
        employee1.setBaseSalary(50_000);
        employee1.setHourlyRate(20);
        int wage = employee1.calculateWage(10);
        System.out.println(wage);
    }
}




package com.youtube;

public class Employee {
    //Abstraction and Coupling
    private int baseSalary;
    private int hourlyRate;


    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary){
        if(baseSalary <= 0)
            throw new IllegalArgumentException("Base salary can not be 0 or less");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }
    public void setHourlyRate(int hourlyRate){
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }
}



