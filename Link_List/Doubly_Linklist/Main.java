package com.rohit.Link_List.Doubly_Linklist;

public class Main {
    public static void main(String[] args) {

        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(9);
        list.insertFirst(10);
        list.insertLast(66);
        list.insertIdx(9,65);
        list.display();



    }
}
