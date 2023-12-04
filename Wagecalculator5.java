package com.youtube;

public class Main {
    public static void main(String[] args) {
        //Constructors
        Employee employee1 = new Employee(50_000,20);
        int wage = employee1.calculateWage(10);
        System.out.println(wage);
    }
}



package com.youtube;

public class Employee {
    //Constructors
    private int baseSalary;
    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }


    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
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
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }
}
