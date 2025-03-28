package com.rohit;

import java.util.*;

public class solving_basicquestion_using_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={9,6,5,3,2,1};
        int target = 6;
        int ans = findmin(arr);
        System.out.println(ans);

    }
    public static void printevennumber(int n){
        int x=1,es=0;
        while(n>0){
            if(x%2==0){
                System.out.println(x+" ");
                es+=x;
                n--;
            }
            x++;
        }
        System.out.println("sum of even number is "+es);
    }
    public static void printprime(int n){
        int x=2,flag=0;
        System.out.println("'N' prime numbers are : ");
        while(n>0){
            for(int i=2; i<x/2; i++){
                if(x%i==0){
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
    public static int BS(int []arr,int  target){
        int start=0;
        int end = arr.length-1;
        boolean isAsc = arr[start]<arr[end];

        if(arr.length==0){
            return -1;
        }
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else{
                if(isAsc){
                    if(target > arr[mid]){
                        start = mid+1;
                    }else {
                        end = mid-1;
                    }
                }else{
                    if(target > arr[mid]){
                        end = mid-1;
                    }else{
                        start = mid+1;
                    }
                }
            }
        }
        return -1;
    }
    public static int findmax(int []arr){
        int ans= arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]>ans){
                ans = arr[i];
            }
        }
        return ans;
    }
    public static int findmin(int []arr){
        int ans= arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }


}
