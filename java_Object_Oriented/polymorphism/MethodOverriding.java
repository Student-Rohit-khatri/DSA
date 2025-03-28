package com.rohit.java_Object_Oriented.polymorphism;

class Vehicle{
    void run(){
        System.out.println("Vehicle is Running");
    }
}

class Car extends Vehicle{

    void run(){
        System.out.println("Car is Running");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Car c = new Car();
        c.run();
    }
}
