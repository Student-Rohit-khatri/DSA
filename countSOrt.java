package com.rohit;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;

public class countSOrt {
    public static void main(String[] args) {
        int arr[] = {6,3,10,9,2,4,9,7};
        countSortHas(arr);
        System.out.println(Arrays.toString(arr));
    }
    // count sort is a non comparison based sorting algorithm
    // It's good for small numbers
    public static void CountSort(int arr[]){

        int max = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        int count[] = new int[max+1];
        for(int i = 0 ; i < arr.length ; i++){
            count[arr[i]]++;
        }

        int idx = 0;
        for (int i = 0 ; i < count.length ; i++){
            while (count[i] > 0){
                arr[idx++] = i;
                count[i]--;
            }
        }

    }

    public static void countSort(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }
        int max = arr[0];
        for(int num : arr){
            if(num > max){
                max = num;
            }
        }

        int [] countArray = new int[max+1];
        for(int num : arr){
            countArray[num]++;
        }

        int index = 0;
        for(int i = 0 ; i <= max ; i++){
            while(countArray[i]>0){
                arr[index] = i;
                index++;
                countArray[i]--;
            }
        }

    }

    //using Hashmap
    public static void countSortHas(int[] arr){
        if(arr == null || arr.length <= 1){
            return;
        }

        int max = Arrays.stream(arr).max().getAsInt();//using collection framework to find max number
        int min = Arrays.stream(arr).min().getAsInt(); // to find the minimum number

        Map<Integer,Integer> countMap= new HashMap<>();
        for(int num : arr){
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }

        int index = 0;
        for(int i = min ; i <= max ; i++){
            int count = countMap.getOrDefault(i,0);
            for(int j = 0 ; j < count ; j++){
                arr[index] = i;
                index++;
            }
        }

    }
}
