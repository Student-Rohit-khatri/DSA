package com.rohit.Arrays;

import java.util.*;
public class array2d {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows and cols : ");
        int r = sc.nextInt();
        int c = sc.nextInt();

        int [][] number= new int[r][c];
        System.out.println("Enter a elements of number : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println("Elements of number are : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(number[i][j]+" ");
            }
            System.out.println();
        }

    }


}
