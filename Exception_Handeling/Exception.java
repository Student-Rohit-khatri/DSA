package com.rohit.Exception_Handeling;

public class Exception {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
            int c = a/b;
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());


        }finally {
            System.out.println("This is always execute");
        }
    }
}
