package com.rohit;

import java.util.Arrays;

public class sort_practice {
    public static void main(String[] args) {
        int []arr={11,4,6,1,9,5,3,10,2,5};
        shellSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static void shellSort(int arr[]){
        int n = arr.length;
        for(int gap = n/2 ; gap > 0 ; gap = gap/2){
            for (int i = gap ; i < n ; i++){
                for (int j = i - gap ; j >= 0 ; j = j - gap){
                    if(arr[j] > arr[j+gap]){
                        int temp = arr[j];
                        arr[j] = arr[j+gap];
                        arr[j+gap] = temp;
                    }else{
                        break;
                    }

                }
            }
        }
    }


}
