package com.rohit.Queues;

public class Queue {
    int arr[];
    int front;
    int rear = -1;

    public Queue(int n) {
       arr = new int[n];
    }

    public void add(int data){
        if(isFUll()){
            System.out.println("Queue is full.");
            return;
        }
        rear++;
        arr[rear] = data;


    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty.");
            return -1;
        }
        int delete = arr[0];
        for (int i = 1 ; i <= rear ; i++){
            arr[i-1] = arr[i];
        }
        rear--;
        return delete;
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[0];
    }

    public void display(){
        for(int i = 0 ; i <= rear ; i++){
            System.out.print(arr[i] + " -> ");
        }
        System.out.print("End");
    }

    public boolean isFUll(){
        if(rear == arr.length-1){
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(rear == -1){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
       Queue q = new Queue(5);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);
       q.add(6);
       System.out.println(q.remove());
        System.out.println(q.peek());
       q.display();

    }
}
