package com.rohit.HashMap;

import java.util.HashSet;

public class unionOfArrays {
    public static void main(String[] args) {
        int arr1[] = {7, 3, 9};
        int arr2[] = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> s = union(arr1,arr2);
        System.out.println(s);
        System.out.println(s.size());
    }
    //In this question we will find the union size of the 2 Array using HashSet

    public static HashSet<Integer> union(int arr1[] , int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr1.length ; i++){
            set.add(arr1[i]);
        }

        for(int i = 0 ; i < arr2.length ; i++){
            set.add(arr2[i]);
        }

        return set;
    }

    public static int unionSize(int arr1[] , int arr2[]){
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr1.length ; i++){
            set.add(arr1[i]);
        }

        for(int i = 0 ; i < arr2.length ; i++){
            set.add(arr2[i]);
        }

        return set.size();
    }

}
