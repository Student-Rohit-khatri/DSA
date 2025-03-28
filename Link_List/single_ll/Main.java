package com.rohit.Link_List.single_ll;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.addFirst("is");
        list.addFirst("name");
        list.addFirst("My");
        list.addLast("Rohit");
        list.addLast("khatri");
        list.addLast("hi");
        list.deleteLast();
        list.printList();
        list.Rev();
        System.out.println();
        list.printList();
    }
}
