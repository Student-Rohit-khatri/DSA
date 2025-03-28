package com.rohit.Link_List.single_ll;

public class LL {
    Node head;
    private int size;

    public LL() {
        this.size = 0;
    }

    //add -first last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    //delete first
    public void deleteFirst(){
        String s = head.data;
        System.out.println(s);
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }
        size--;
        head = head.next;

    }

    //delete last
    public void deleteLast(){
        if(head == null){
            System.out.println("The list is empty.");
            return;
        }
        size--;
        Node secondLast = head;
        Node lastNode = head.next;
        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }


    public void Reverse(){
        Node prev = null;
        Node curr = head;
        while(curr != null){
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        head = prev;
    }

    public Node Rev(){
       return Rev(head);
    }

    private Node Rev(Node node){

        if(node.next == null){
            head = node;
            return head;
        }


        Node NewHead = Rev(node.next);
        Node temp = node.next;
        temp.next = node;
        node.next = null;

        return NewHead;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is Empty.");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }

    }


    class Node{
        String data;
        Node next;

        public Node(String data) {
            this.data = data;
            this.next = null;
            size++;
        }



    }
    public int getSize(){
        return size;
    }
}
