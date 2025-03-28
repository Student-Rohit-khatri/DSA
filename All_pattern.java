package com.rohit;

import java.util.*;

public class All_pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of rows : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        printpattern11(r,c);


    }
    public static void printpattern1(int r,int c){
        for(int i=0;i<r;i++){
            for(int j=0; j<c; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printpattern2(int r, int c){
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || i==r || j==1 || j==c){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printpattern3(int r ,int c){
       for(int i=1 ; i<=r ; i++) {
           for (int j = 1; j <= i; j++) {
               System.out.print("* ");
           }
           System.out.println();
       }
    }

    public static void printpattern4(int r, int c){
        for(int i=r; i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printpattern5(int r, int c){
        for(int i=1; i<=r; i++){
            for(int j=1; j<=(r-i)+1; j++){
                if(i==1 || j==1 || j==(r-i)+1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void printpattern6(int r, int c){
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i;j++){
                System.out.print("  ");
            }
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void printpattern7(int r, int c){
        for(int i=1; i<=r;i++){
            for(int j=1; j<=i-1; j++){
                System.out.print("  ");
            }
            for(int k=1; k<=r-i+1; k++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    public static void printpattern8(int r, int c){
        for(int i=1; i<=r; i++){
            for(int j=1; j<=r-i;j++){
                System.out.print("   ");
            }
            for(int k=1; k<=(2*i)-1; k++){
                if(k==1 || i==r || k==(2*i)-1){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    public static void printpattern9(int r, int c){
        for(int i=1;i<=r;i++){
            for(int j=1; j<=i; j++){
                if(j==1 || i==r || j==i){
                    System.out.print(j+" ");
                }else{
                    System.out.print("  ");
                }

            }
            System.out.println();
        }
    }
    //Diamond pattern
    public static void printpattern10(int r, int c){
        //upper part
        for(int i=1; i<=r; i++){
            //space printing
            for(int j=1; j<=r-i; j++){
                System.out.print("   ");
            }
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        //lower part
        for(int i=r-1; i>=1; i--){
            //space printing
            for(int j=1; j<=r-i; j++){
                System.out.print("   ");
            }
            for(int k=1; k<=(2*i)-1; k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    //Butterfly pattern
    public static void printpattern11(int r, int c){
        //upper part
        for(int i=1; i<=r; i++) {
            //printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            //printing spaces
            for (int j=1;j<=2*(r-i); j++){
                System.out.print("   ");

            }
            for(int j=1;j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        //for lower parts
        for(int i=r; i>=1; i--) {
            //printing stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }

            //printing spaces
            for (int j=1;j<=2*(r-i); j++){
                System.out.print("   ");

            }
            for(int j=1;j<=i; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }



}
