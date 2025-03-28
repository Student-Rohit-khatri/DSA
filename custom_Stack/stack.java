package com.rohit.custom_Stack;

public class stack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public stack() {
        this(DEFAULT_SIZE);
    }

    public stack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full.");
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is empty.pop operation can't be perform.");

        }

        int removed = data[ptr];
        ptr--;
        return removed;
    }
    private boolean isFull(){
        return ptr == data.length-1;
    }

    private boolean isEmpty(){
        return ptr == -1;
    }
    public void display(){
        if(ptr == -1){
            System.out.println("stack is empty.");
            return;
        }else {
            for (int i = 0; i <= ptr ; i++){
                System.out.print(data[i]+"\t");
            }
        }
    }

    public static void main(String[] args) {
        stack s = new stack(5);
        s.push(10);
        s.push(12);
        s.push(14);
        s.push(16);
        s.push(18);
        s.display();
        System.out.println(s.pop());

    }
}
