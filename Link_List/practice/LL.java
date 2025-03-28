package com.rohit.Link_List.practice;

import java.util.LinkedList;

public class LL {
    Node head;
    public void insertFirst(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }

   public void insertLast(int val){
        if(head == null){
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
   }

    public void deleteFirst(){
        if(head == null){
            System.out.println("There is nothing to delete.");
        }
        head = head.next;
    }

    public void deleteLast(){
        Node temp = head;
        while (temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
    }

    public void insertMid(int val,int idx){
        if(idx == 0){
            insertFirst(val);
            return;
        }
        if(idx == size()){
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 0; i < idx ; i++){
            temp = temp.next;
        }
        Node newNode = new Node(val,temp.next);
        temp.next = newNode;
    }

    public int size(){
        Node temp = head;
        int val = 0;
        while (temp != null){
            temp = temp.next;
            val++;
        }
        return val;
    }

    public void display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value+" " + " -> "+" ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
    public static void main(String[] args) {
       LL list = new LL();
       list.insertFirst(2);
       list.insertFirst(5);
       list.insertLast(6);
       list.insertLast(8);
       list.insertMid(4,2);
       list.display();


    }

}
