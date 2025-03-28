package com.rohit;

import java.util.*;

public class recursion2 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int sum=DisplaySum(n);

        System.out.println("sum of n number is "+sum);
    }
    public static int DisplaySum(int n){
        if(n==1){
            return 1;
        }else{
            return n+DisplaySum(n-1);
        }

    }

}
