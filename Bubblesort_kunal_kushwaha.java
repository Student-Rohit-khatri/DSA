package com.rohit;

public class Bubblesort_kunal_kushwaha {
    public static void main(String[] args) {
        int []arr = {1,2,5,4,3};
        bubble(arr);

    }
    static void bubble(int []arr){

        for (int i=0; i<arr.length; i++){

            //swap if smaller than previous item
            for(int j=1; j<arr.length-i; j++){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]= temp;

                }

            }
        }
        //printing sorted numbers
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
