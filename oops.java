package com.rohit;

public class oops {
    public static void main(String[] args) {
        student[] students = new student[5];

        //just declaring
        student rohit;
        rohit = new student();
        rohit.rno = 13;
        rohit.name = "Rohit khatri";
        rohit.marks = 88.5f;

        System.out.println(rohit.marks);
        System.out.println(rohit.name);
        System.out.println(rohit.rno);
    }
}

//create a class
//for every single student
class student{
    int rno;
    String name;
    float marks;
}

