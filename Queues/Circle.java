package com.rohit.Queues;

public class Circle {
        int arr[];
        int front = -1;
        int rear = -1;
        int size;

    public Circle(int n) {
        arr = new int[n];
        this.size = n;
    }

    public void add(int data){
        if(isFull()){
            System.out.println("Queue is full.");
            return;
        }
        if(front == -1){
            front = 0;
        }

        rear = (rear+1)%size;
        arr[rear] = data;
    }

    public int remove(){
        if(isEmpty()){
            System.out.println("Empty queue.");
            return -1;
        }
        int del = arr[front];
        if(rear == front){
            rear = front = -1;
        }else {
            front = (front+1)%size;
        }
        return del;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Empty queue.");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty(){
        return rear == -1 && front == -1;
    }
    public boolean isFull(){
        return (rear+1)%size == front;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty.");
            return;
        }
        int i = front;
        do{
            System.out.print(arr[i]+" -> ");
            i++;
            i %= size;
        }while (i != rear+1);


    }

    public static void main(String[] args) {
        Circle q = new Circle(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.remove());
        q.add(6);
        q.display();
    }
}
