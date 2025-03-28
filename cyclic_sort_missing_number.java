package com.rohit;

public class cyclic_sort_missing_number {
    public static void main(String[] args) {
        int []arr = {4,0,2,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int []arr){
        int i=0;
        while (i< arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }
        //search for missing number
        for(int index=0; index< arr.length; index++){
            if(arr[index]!= index){
                return index;
            }
        }
        return arr.length;
    }
}
