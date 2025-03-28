package com.rohit.java_Object_Oriented.polymorphism;

class Adder{
    static int add(int a , int b){
        return a+b;
    }
    static int add(int a, int b , int c){
        return a + b + c;
    }
}

// Method overloading in Java allows defining multiple methods
// with the same name but different parameter lists

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("Sum of Two number is " +  Adder.add(2,3));
        System.out.println("Sum of Three number is "+Adder.add(2,3,4));
    }
}
