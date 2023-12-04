package com.youtube;

public class Main {
    public static void main(String[] args) {
        //getters and setters

        Employee employee1 = new Employee();
        employee1.setBaseSalary(100000);
        employee1.getBaseSalary();
        employee1.setHourlyRate(500);
        employee1.getHourlyRate();
        int wage = employee1.calculateWage(10);
        System.out.println(wage);

    }
}


package com.youtube;

public class Employee {
    //getters and setters
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

    public int getBaseSalary(){
        return baseSalary;
    }
    public void setHourlyRate(int hourlyRate){
        if(hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly Rate can not be 0 or less");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate(){
        return hourlyRate;
    }
}
