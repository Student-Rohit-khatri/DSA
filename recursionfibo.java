package com.rohit;
import java.util.*;

public class recursionfibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int f=fibo(n);
        System.out.println("nth term is : "+f);
    }
    public static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}

