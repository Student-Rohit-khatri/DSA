package com.rohit;
import java.util.*;
import java.util.Arrays;

public class All_sorting_algorithm {
    public static void main(String[] args) {

        System.out.println(Lcm(2,8));
    }

    public static void bs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j - 1] < arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        System.out.println("Array in sorted order :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void selectionsort(int arr[]){
        for(int i=0; i<arr.length ; i++){
            int max = i;
            int last = arr.length-1;
            for(int j=1+i; j<=last; j++){
                if(arr[max]<arr[j]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[max];
            arr[max]=temp;

        }
    }
    public static int Hcf(int a, int b){
        int min = a;
        if(a>b){
            min = b;
        }
        for(int i=min; i>=1 ; i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return -1;

    }
    public static int Lcm(int a, int b){
        int lcm = (a*b)/Hcf(a,b);
        return lcm;
    }
}