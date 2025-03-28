package com.rohit;

import java.util.Arrays;

public class nothing {
    public static void main(String[] args) {
        System.out.println(hcf(10,6));

    }
    public static int hcf(int a , int b){
        if(a==0){
            return b;
        }
        return hcf(b%a,a);
    }

}
