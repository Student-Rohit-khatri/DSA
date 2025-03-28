package com.rohit;

import java.util.*;

public class condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between(1-3) :   ");
        int n = sc.nextInt();
        switch(n){
            case 1:
                System.out.println("hello");
                break;

            case 2:
                System.out.println("namaste");
                break;

            case 3:
                System.out.println("Bonjour");
                break;

            default :
                System.out.println("invalid");
                break;
        }
    }
}
