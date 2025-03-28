package com.rohit.java_Object_Oriented.object_class;

class Rectangle{
    int length;
    int width;

    public Rectangle(int length , int width){
        this.length = length;
        this.width = width;
    }

    public void calcArea(){
        calculateArea();
    }

    private void calculateArea(){
        System.out.println("Area of a Triangle is : " + length * width);
    }

}

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(4,5);
        r.calcArea();
    }
}
