package com.rohit.Link_List.practice;

public class Reverse {
    Node head;
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
            this.next = null;
        }
    }

    public Reverse(){}

    public void insertLast(int val){
        if(head == null){
            head = new Node(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printLL(){
        if(head == null){
            System.out.println("The Linked list is empty.");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public void ReverseLL(){
        Node last = null;
        Node curr = head;
        while(curr != null){
            Node Next = curr.next;
            curr.next = last;
            last = curr;
            curr = Next;
        }
        head = last;
    }

    public void ReverseRec(){
        if(head == null || head.next == null){
            return;
        }
        ReverseRec(head);
    }
    public Node ReverseRec(Node node){
        if(node.next == null){
            head = node;
            return head;
        }
        Node curr = ReverseRec(node.next);
        Node Next = node.next;
        Next.next = node;
        node
                .next = null;
        return curr;
    }
    public static void main(String[] args) {
        Reverse SL = new Reverse();
        SL.insertLast(1);
        SL.insertLast(2);
        SL.insertLast(3);
        SL.insertLast(4);
        SL.printLL();
        System.out.println();
        SL.ReverseRec();
        SL.printLL();
    }
}
