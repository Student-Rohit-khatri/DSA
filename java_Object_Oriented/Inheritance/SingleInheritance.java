package com.rohit.java_Object_Oriented.Inheritance;


class Employee{
    String name;
    int employeeId;
    double salary;

    public Employee(){}

    public Employee(String name , int employeeId , double salary){
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }

}

class Manager extends Employee{
    String department;

    public Manager(String name , int employeeId , double salary , String department){
        super(name, employeeId, salary);
        this.department = department;
    }

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Department : " + department);
    }

}

public class SingleInheritance {
    public static void main(String[] args) {
        Manager m = new Manager("Rohit khatri",25,25000.0,"Computer science");
        m.displayDetails();
    }
}
