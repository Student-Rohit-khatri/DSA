package com.rohit.Queues;

public class circularQueues {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int front = 0;

    int end = 0;
    int size = 0;

    public circularQueues() {
        this(DEFAULT_SIZE);
    }

    public circularQueues(int size ) {
        this.data = new int[size];
    }

    public boolean insert(int item){
        if (isFull()){
            return false;
        }
        data[end++] = item;
        end = end%data.length;
        size++;
        return true;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
        }
        int removed = data[front++];
        front = front%data.length;
        size--;
        return removed;
    }

    public int front(){
        if(isEmpty()){
            System.out.println("Queue is Empty.");
        }
        return data[front];
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " -> ");
            i++;
            i %= data.length;
        }while (i != end);
        System.out.println("End");
    }

    public boolean isFull(){
        return size == data.length;
    }

    public boolean isEmpty(){
        return end == 0;
    }

    public static void main(String[] args) {
        circularQueues queues = new circularQueues(5);
        queues.insert(1);
        queues.insert(2);
        queues.insert(15);
        queues.insert(25);
        System.out.println(queues.remove());
        queues.display();
    }
}
