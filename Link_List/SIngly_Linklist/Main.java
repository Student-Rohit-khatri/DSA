package com.rohit.Link_List.SIngly_Linklist;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insert(100,3);
        list.display();
        System.out.println(list.delete(2));
        list.insertRec(88,2);
        list.display();
        list.reverse();
        list.display();
    }
}
