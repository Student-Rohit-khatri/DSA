package com.rohit.OOP.Object_and_Classes;

public class classes {
    public static void main(String[] args) {
        student rohit = new student();
       // rohit.rno = 25;
       // rohit.name = "Rohit khatri";
       // rohit.marks = 145.4f;

      //  System.out.println(rohit.rno);
       // System.out.println(rohit.name);
      //  System.out.println(rohit.marks);
        rohit.changeName("program lover");
        rohit.gretting();

    }

}
class student {
    int rno;
    String name;
    float marks;

    //we need a way to add the values of the above
    //properties object by object
    //we need one word to access every object
    void gretting(){
        System.out.println("Hello my name is "+ this.name);
    }
    void changeName(String newName){
        name = newName;
    }
    student(){
        this.rno=13;
        this.name="Rohit khatri";
        this.marks = 88.5f;
    }
}