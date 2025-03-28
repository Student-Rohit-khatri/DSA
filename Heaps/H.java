package com.rohit.Heaps;

import java.util.Arrays;

public class H {

    static class Heap{
        int defaultSize = 10;
        int arr[];
        int idx;

        public Heap(){
            this.arr = new int[defaultSize];
            this.idx = 0;
            Arrays.fill(arr,-1);
        }

        public void resize(){
            defaultSize = 2 * defaultSize;
            arr = Arrays.copyOf(arr,defaultSize);
        }

        private void upHeapify(int i){
            int par = (int) ((i-1) / 2);
            if ( i > 0 && arr[par] < arr[i]){
                int temp = arr[par];
                arr[par] = arr[i];
                arr[i] = temp;

                upHeapify(par);
            }
        }

        private void insert(int num){
            if(idx == defaultSize){
                resize();
            }

            if(idx == 0){
                arr[idx] = num;
                idx++;
                return;
            }
            arr[idx] = num;
            upHeapify(idx);
            idx++;
        }

        private void delete(){
            if(idx == 0){
                System.out.println("Heap is Empty");
                return;
            }

            arr[0] = arr[idx-1];
            arr[idx-1] = -1;
            idx--;
            if(idx > 0){
                downHeapify(0);

            }

        }

        private void downHeapify(int i ){

            int lc = 2 * i + 1;
            int rc = 2 * i + 2;
            int largest = i;

            if (lc < idx && arr[lc] > arr[largest]) {
                largest = lc;
            }
            if (rc < idx && arr[rc] > arr[largest]) {
                largest = rc;
            }
            if (largest != i) {
                int temp = arr[i];
                arr[i] = arr[largest];
                arr[largest] = temp;
                downHeapify(largest);
            }

        }

        public void heapSort() {
            int originalIdx = idx;

            for (int i = idx - 1; i > 0; i--) {

                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;


                idx--;
                downHeapify(0);
            }

            idx = originalIdx;
        }

        private void display(){
            for(int i = 0 ; i < idx ; i++){
                System.out.print(arr[i] + " ");
            }
        }

    }

    public static void main(String[] args) {
        int arr[] = {2,10,3,5,20};
        Heap heap = new Heap();
        for(int i = 0 ; i < arr.length ; i++){
            heap.insert(arr[i]);
        }
        heap.display();
        System.out.println();
       heap.heapSort();
       heap.display();
    }
}
