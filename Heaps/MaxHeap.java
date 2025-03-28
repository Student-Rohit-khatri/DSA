package com.rohit.Heaps;

public class MaxHeap {
    private int[] heap;
    private int size;
    private int maxSize;

    public MaxHeap(int maxSize) {
        this.maxSize = maxSize;
        this.size = 0;
        heap = new int[maxSize];
    }

    private int parent(int pos) {
        return (pos - 1) / 2;
    }

    private int leftChild(int pos) {
        return 2 * pos + 1;
    }

    private int rightChild(int pos) {
        return 2 * pos + 2;
    }

    public int getMax(){

        return heap[0];
    }

    private boolean isLeaf(int pos) {
        return pos >= size / 2 && pos < size;
    }

    private void swap(int fpos, int spos) {
        int temp = heap[fpos];
        heap[fpos] = heap[spos];
        heap[spos] = temp;
    }

    private void maxHeapify(int pos) {
        if (!isLeaf(pos)) {
            int left = leftChild(pos);
            int right = rightChild(pos);
            int largest = pos;
            if (left < size && heap[left] > heap[largest]) {
                largest = left;
            }
            if (right < size && heap[right] > heap[largest]) {
                largest = right;
            }
            if (largest != pos) {
                swap(pos, largest);
                maxHeapify(largest);
            }
        }
    }

    public void insert(int element) {
        if (size >= maxSize) {
            System.out.println("Heap is full!");
            return;
        }
        heap[size++] = element;
        int current = size - 1;
        while (current != 0 && heap[current] > heap[parent(current)]) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    public int delete() {
        if (size == 0) {
            System.out.println("Heap is empty!");
            return Integer.MIN_VALUE;
        }
        int popped = heap[0];
        heap[0] = heap[--size];
        maxHeapify(0);
        return popped;
    }

   public int[] heapSort(){
        int sort[] = new int[size];
        for(int i = heap.length-1 ; i >= 0 ; i--){
            sort[i] = delete();

        }
        return sort;
   }

    public void printHeap() {
        int sortedList[] = heapSort();
        for (int i = 0; i < sortedList.length; i++) {
            System.out.print(sortedList[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        MaxHeap maxHeap = new MaxHeap(9);
        maxHeap.insert(5);
        maxHeap.insert(3);
        maxHeap.insert(17);
        maxHeap.insert(10);
        maxHeap.insert(84);
        maxHeap.insert(19);
        maxHeap.insert(6);
        maxHeap.insert(22);
        maxHeap.insert(9);
        maxHeap.printHeap();

        
    }
}
