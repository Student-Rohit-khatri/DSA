package com.rohit;

public class Recursionpart4 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 5};
        System.out.println(find(arr,4,0));
        System.out.println(findIndex(arr, 4, arr.length - 1));
    }

    public static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    public static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index - 1);
            
        }
    }
}
