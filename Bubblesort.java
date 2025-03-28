package com.rohit;

import java.util.*;

public class Bubblesort {

    public static void main(String[] args) {

        int a[]={7,8,3,1,2};
        PrintArray(a);
    }
    public static void PrintArray(int a[]){
        //bubble sort
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    //swaping
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }

            }
        }
        //printing sorting numbers
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

}
