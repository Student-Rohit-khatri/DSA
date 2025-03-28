package com.rohit.OOP.singleton;

public class main {
    public static void main(String[] args) {
        singleton obj = singleton.getInstance();
        singleton obj2 = singleton.getInstance();
        singleton obj3 = singleton.getInstance();
        // ALl 3 reference variable are pointing to just one object

    }
}
