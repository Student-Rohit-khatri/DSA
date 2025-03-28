package com.rohit.OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        shape.area();
        circle.area();
        square.area();
    }
}

 class Shapes{
    void area(){
        System.out.println("Iam in shapes");
    }

}

class Circle extends Shapes{
    void area(){
        System.out.println("Area is pie * r * r ");
    }
}

class Triangle extends Shapes{
    void area(){
        System.out.println("Area is 0.5 * height * side");
    }
}

class Square extends Shapes{
    void area(){
        System.out.println("Area is square of side.");
    }
}

