package com.rohit;

import java.util.*;

public class sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows and cols : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int [][] a = new int[r][c];
        System.out.println("Enter a element of 'a' : ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]= sc.nextInt();
            }
        }
        rev(a,r,c);

    }
    public static void rev(int [][]a,int r,int c){
        int[][] rm = new int[r][c];
        System.out.println("Reverse matrix is : ");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                rm[i][j] = a[j][i];
                System.out.print(rm[i][j]+" ");
            }
            System.out.println();
        }
    }

}
