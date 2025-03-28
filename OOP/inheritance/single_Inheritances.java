package com.rohit.OOP.inheritance;

public class single_Inheritances {
    public static void main(String[] args) {
        Info rohit = new Info("Rohit", 20);
        rohit.display();
    }
}

class student {
    String name;

    public student(String name) {
        this.name = name;
    }
}

class Info extends student {
    int age;

    public Info(String name, int age) {
        super(name);
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + this.name);
        System.out.println("Age : " + this.age);
    }
}
