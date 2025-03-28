package com.rohit;

public class Recursion {
    public static void main(String[] args) {

        System.out.println("power value is " +fact(2,3));
    }
    public static int fact(int n, int p){
        if(p==0){
            return 1;
        }

        return n * fact(n,p-1);
    }

}
