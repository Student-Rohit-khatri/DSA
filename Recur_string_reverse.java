package com.rohit;

public class Recur_string_reverse {
    public static void main(String[] args) {
        String str = "Rohit Khatri";
       printrev(str,str.length()-1);
    }
    public static void printrev(String str,int idx){
        if(idx==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printrev(str , idx-1);

    }
}
