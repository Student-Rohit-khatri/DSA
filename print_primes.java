package com.rohit;

public class print_primes {
    public static void main(String[] args) {

        System.out.println("square root of number is "+squareroot(10));
    }
    public static void primes(int start ,int end ){

        while(start<end){
            int flag=0;
            for(int i=2; i<=start/2; i++){
                if(start % i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(start);
            }

            start++;
        }
    }
    public static void printNprimes(int n){
        int x=2;
        while(n!=0){
            int flag=0;
            for(int i=2; i<=x/2; i++){
                if(x%2==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(x);
                n--;
            }
            x++;

        }
    }
    public static int squareroot(int n){
        for(int i=0;i<n/2;i++){
            if(i*i==n){
                return i;
            }
        }
        return -1;
    }

}
