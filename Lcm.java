package com.rohit;

public class Lcm {
    public static void main(String[] args) {
        System.out.println(Lcm(5,4));
    }
    //using recursion
    public static int Hcf(int a, int b ){
       if(a==0){
           return b;
       }
       return Hcf(b%a,a);
    }
    public static int Lcm(int a, int b){

        return a*b / Hcf(a,b);
    }

}
