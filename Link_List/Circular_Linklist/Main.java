package com.rohit.Link_List.Circular_Linklist;

public class Main {
    public static void main(String[] args) {
        CLL list = new CLL();
        list.insert(23);
        list.insert(25);
        list.insert(98);
        list.insert(2);
        list.delete(98);
        list.display();
    }
}
