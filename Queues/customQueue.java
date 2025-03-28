package com.rohit.Queues;

public class customQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    int end = 0;

    public customQueue() {
        this(DEFAULT_SIZE);
    }

    public customQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Size of Queues is full, so you can't insert more items.");
            return false;
        }
        data[end++] = item;
        return true;

    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Stack is empty . we can't perform remove from stack.");
        }
        int removed = data[0];
        for (int i = 1; i < end ; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public boolean isFull(){
        return end == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public void display(){
        for (int i = 0; i < end ; i++){
            System.out.print(data[i]+"\t");
        }
    }

    public static void main(String[] args) {
        customQueue queue = new customQueue(5);
        queue.insert(5);
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        System.out.println(queue.remove());
        queue.display();

    }
}
