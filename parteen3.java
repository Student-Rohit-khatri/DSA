package com.rohit;

import java.util.*;

public class parteen3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows : ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            //spaces
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            //first half number
            for(int j=i;j>=1;j--) {
                System.out.print(j);
            }
            //second half number
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
