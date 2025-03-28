package com.rohit;

public class Hcf_or_gcd {
    public static void main(String[] args) {
        int ans = calculateHCF(7,4);
        System.out.println(ans);

    }
    public static int gcd(int a, int b){
        if(a==0){
            return b;
        }
        return gcd(b%a, a);
    }
    //or use this method
    public static int calculateHCF(int a, int b) {
        while (b != 0) {
           int remainder = a%b;
           a = b;
           b = remainder;
        }
        return a;
    }


}
