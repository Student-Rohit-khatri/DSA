package com.rohit;

import java.util.*;
public class Recursion3 {
    public static void main(String[] args) {
    print(10);
    }
    static void print(int n){
        if(n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        print(n-1);
    }

}
