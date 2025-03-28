package com.rohit.OOP.Abstract_Class;

public class Main {
    public static void main(String[] args) {

    }
}

abstract class parent{
    abstract void career();
    abstract void partner();
}

class son extends parent{

    @Override
    void career() {
        System.out.println("Iam going to be a doctor.");
    }

    @Override
    void partner() {
        System.out.println("I Love pepper potts.");
    }
}

class Daughter extends parent{

    @Override
    void career() {
        System.out.println("I'am going to be a coder.");
    }

    @Override
    void partner() {
        System.out.println("I Love Ironman.");
    }
}
