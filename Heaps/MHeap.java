package com.rohit.Heaps;
import java.util.*;

public class MHeap {
    public static void maxHeapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            maxHeapify(arr, n, largest);
        }
    }

    public static void buildMaxHeap(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
    }

    public static int deleteMax(int[] arr, int heapSize) {
        if (heapSize == 0) {
            System.out.println("Heap is empty");
            return -1;
        }
        int maxVal = arr[0];
        arr[0] = arr[heapSize - 1];
        heapSize--;
        maxHeapify(arr, heapSize, 0);
        return maxVal;
    }

    public static int[] heapSort(int[] arr) {
        buildMaxHeap(arr);
        int heapSize = arr.length;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = deleteMax(arr, heapSize--);
        }
        return arr;
    }

    public static void printSortedArray(int[] arr) {
        int[] sortedArr = heapSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(sortedArr));
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4,13, 12, 11, 10,};
        System.out.println("Original array: " + Arrays.toString(arr));
        printSortedArray(arr);
    }
}
