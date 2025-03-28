package com.rohit.java_Object_Oriented.Comparator;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

// This is a one way to sort on the basis of the height
class SortByHeightThenAge implements Comparator<int[]> {
    @Override
    public int compare(int[] a, int[] b) {
        if (a[1] == b[1]) {
            return Integer.compare(a[0], b[0]); // If height is the same, sort by age
        }
        return Integer.compare(a[1], b[1]); // Otherwise, sort by height
    }
}

class SortByAgeThenHeight implements Comparator<int[]> {
    public int compare(int[] a , int[] b){
        if(a[0] == b[0]){
            return Integer.compare(a[1],b[1]);
        }
        return Integer.compare(a[0],b[0]);
    }
}

public class comparator {
    public static void main(String[] args) {
        int arr[][] = {{23,9},{19,6},{22,5},{22,8},{21,4},{33,8}};
        // Implementation on the basis of the height
//        Arrays.sort(arr,new SortByHeightThenAge());

//        Another way to implement on the basis of the height is :-

//        Arrays.sort(arr,(a,b) -> {
//            if(a[1] == b[1]){
//                return Integer.compare(a[0],b[0]);
//            }
//            return Integer.compare(a[1],b[1]);
//        });

        // implementation based on the age

//        Arrays.sort(arr,new SortByAgeThenHeight());
        Arrays.sort(arr,(a,b) -> {
            if(a[0] == b[0]){
                return Integer.compare(a[1],b[1]);
            }
            return Integer.compare(a[0],b[0]);
        });



        System.out.println("Sort by age height , then by age : ");
        for(int row[] : arr){
            System.out.println(Arrays.toString(row));
        }

    }
}
