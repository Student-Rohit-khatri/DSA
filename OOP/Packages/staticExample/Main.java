package com.rohit.OOP.Packages.staticExample;

public class Main {
    public static void main(String[] args) {
        Human Rohit = new Human(20,"Rohit khatri",10000,false);
        Human Ishwor = new Human(20,"Ishwor",10000,false);

        //static variable are not dependent on objects.it can be accessed without creating objects.
        //In this case we are not accessing static variable like Rohit.population.It's a feature of static variable.
        System.out.println(Human.population);
        System.out.println(Human.population);
    }
}
