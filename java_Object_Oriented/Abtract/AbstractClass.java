package com.rohit.java_Object_Oriented.Abtract;

// Abstract class start with abstract class
// we can't make an object of an abstract class
// It may or may not contain abstract method
// It can have non-abstract method

// Abstract-method
// abstract method don't have body definition

// Reason for using the abstract class
//        Code Re-usability: Abstract classes facilitate code reuse by allowing
//        common methods to be implemented once and inherited by multiple subclasses.
//
//        Defining a Common Interface: Abstract classes can define a common interface for a group of
//        related classes, ensuring consistency in their structure and behavior.

abstract class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle object is created.");
    }
    void start() { System.out.println("Starting vehicle..."); }  // ✅ Common method
    abstract void drive();  // ✅ Abstract method (subclasses must implement)
}

class Car extends Vehicle {
    void drive() { System.out.println("Car driving on road"); }
}

class Boat extends Vehicle {
    void drive() { System.out.println("Boat sailing on water"); }
}

public class AbstractClass {
    public static void main(String[] args) {

        Vehicle v = new Car();
        v.start();
        v.drive();

    }
}
