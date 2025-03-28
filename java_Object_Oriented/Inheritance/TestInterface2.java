package com.rohit.java_Object_Oriented.Inheritance;

interface Bank{
    void Deposited();

}

class Citizen implements Bank{
    public void Deposited(){
        System.out.println("Money is successfully deposited in Citizen Bank.");
    }
}

class GlobalBank implements Bank{
    public void Deposited(){
        System.out.println("Money is successfully deposited in Global bank.");
    }
}

public class TestInterface2 {
    public static void main(String[] args) {
        Citizen c = new Citizen();
        c.Deposited();

        GlobalBank g = new GlobalBank();
        g.Deposited();
    }
}
