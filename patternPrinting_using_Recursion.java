package com.rohit;

public class patternPrinting_using_Recursion {
    public static void main(String[] args) {

        Traingle2(3,0);
    }
    public static void Traingle(int r, int c){
        if(r == 0){
            return;
        }
        if(c<r){
            System.out.print("*"+" ");
            Traingle(r , c+1);
        }else{
            System.out.println();
            Traingle(r-1, 0);
        }
    }
    public static void Traingle2(int r, int c){
        if(r == 0){
            return;
        }
        if(c<r){
            Traingle2(r , c+1);
            System.out.print("*");
        }else{
            Traingle2(r-1, 0);
            System.out.println();
        }
    }

}
