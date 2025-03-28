package com.rohit.java_Object_Oriented.Inheritance;

interface Animal{
    void animalName();
}

interface Feature{
    void color();
}

class Dog implements Animal,Feature{
    @Override
    public void animalName(){
        System.out.println("Animal name is dog");
    }
    @Override
    public void color(){
        System.out.println("Color of the dog is Gray");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.animalName();
        d.color();
    }
}
