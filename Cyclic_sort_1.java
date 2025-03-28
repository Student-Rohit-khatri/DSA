package com.rohit;

import java.util.ArrayList;
import java.util.List;

public class Cyclic_sort_1 {
    public static void main(String[] args) {
        int arr[]={7,3,2,4,8,2,3,1};
        Missing(arr);
        System.out.println(arr);



    }
    public static List<Integer> Missing(int []arr){
        int i=0;
        while(i<arr.length){
            int correct = arr.length-1;
            if(arr[i]<arr.length && arr[i]!=arr[correct]){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct]=temp;
            }else{
                i++;
            }

        }
        List<Integer> ans = new ArrayList<>();
        for(int index=0; index<arr.length; index++){
            if(arr[i]!=index+1){
                ans.add(index+1);
            }
        }
        return ans;
    }

}
