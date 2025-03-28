package com.rohit;

import java.util.*;

public class recursion1 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int fac = factorial(n);
        System.out.println("factorial of N number is : "+fac);

    }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }

}


