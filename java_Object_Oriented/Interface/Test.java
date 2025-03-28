package com.rohit.java_Object_Oriented.Interface;

interface Vehicle{
    public void startVehicle();
}

class Car implements Vehicle{
    @Override
    public void startVehicle(){
        System.out.println("Car is started.");
    }
}

public class Test {
    public static void main(String[] args) {
        Car c = new Car();
        c.startVehicle();
    }
}
