package com.rohit.java_Object_Oriented.Inheritance;

class BaseEmployee{
    String name;
    int id;
    double salary;

    public BaseEmployee(){

    }

    public BaseEmployee(String name , int id , double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Id : " + id);
        System.out.println("Salary : " + salary);
    }

}

class BaseManager extends BaseEmployee{
    String department;

    public BaseManager(){}

    public BaseManager(String name, int id , double salary , String department){
        super(name,id,salary);
        this.department = department;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Department : " + department);
    }

}

class SeniorManager extends BaseManager{
    protected int teamSize;

    public SeniorManager(){}

    public SeniorManager(String name , int id , double salary , String department , int teamSize){
        super(name,id,salary,department);
        this.teamSize = teamSize;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Team Size : " + teamSize);
    }

}

public class MultiLevel {
    public static void main(String[] args) {
        SeniorManager s = new SeniorManager("Rohit" , 25,30000.0,"IT",30);
        s.displayInfo();
    }
}
