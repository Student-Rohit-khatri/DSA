package com.rohit.Arrays;

import java.util.*;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a size of marks : ");
        int size = sc.nextInt();
        int marks[]=new int[size];

        System.out.println("Enter a element of marks : ");
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("Enter a value of x : ");
        int x = sc.nextInt();
        for(int i=0;i<size;i++){
            if (marks[i]==x) {

                System.out.println("x found at index : "+i);
            }
        }

    }
}
