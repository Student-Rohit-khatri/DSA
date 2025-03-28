package com.rohit;

public class recursion5 {
    public static void main(String[] args) {

        System.out.println(digitsum(1342));
    }
    public static int digitsum(int n){
        if(n==0){
            return 0;
        }

        return digitsum(n/10)+(n%10);
    }
}
