package com.youtube;

public class Main {
    public static void main(String[] args) {
        //Encapsulation

        Employee employee1 = new Employee();
        employee1.baseSalary = 50_000;
        employee1.hourlyRate = 20;
        int wage = employee1.calculateWage(10);
        System.out.println(wage);
    }
}





package com.youtube;

public class Employee {
    //Encapsulation
    public int baseSalary;
    public int hourlyRate;


    public int calculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }
}

