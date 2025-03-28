package com.rohit;

import java.util.*;

public class function {
    public static void Compare(int x,int n){
       int value=1;
       for(int i=1;i<=n;i++){
           value *=x;
       }
        System.out.println("Power value is : "+value);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and its power  : ");
        int x = sc.nextInt();
        int n = sc.nextInt();

        Compare(x,n);



    }
}
