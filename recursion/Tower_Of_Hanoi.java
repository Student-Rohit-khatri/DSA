package com.rohit.recursion;

public class Tower_Of_Hanoi {
    public static void main(String[] args) {
        int n=2;
        towerOfHanoi(n,"s","h","d");


    }
    public static void towerOfHanoi(int n,String s, String h, String d){
        // s= source, h = helper, d = destination
        if(n==1){
            System.out.println("transfer disk"+n+" "+"from"+" "+s+" "+"to"+" "+d);
            return;
        }
        towerOfHanoi(n-1,s,d,h);
        System.out.println("transfer disk"+n+" "+"from"+" "+s+" "+"to"+" "+d);
        towerOfHanoi(n-1,h,s,d);

    }

}
