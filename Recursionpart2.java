package com.rohit;

public class Recursionpart2 {
    public static void main(String[] args) {
        Number(5);
    }
    public static void Number(int n){
        if(n==1) {
            System.out.println(1);
            return;
        }
            System.out.println(n);
            Number(n-1);
            System.out.println(n);

        }

}
