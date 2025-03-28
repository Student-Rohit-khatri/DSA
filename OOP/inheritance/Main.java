package com.rohit.OOP.inheritance;

public class Main {
    public static void main(String[] args) {
       // Box box1 = new Box(4,5,6);
        // Box box2 = new Box(box); this is copy constructor.In this case it is value of box1 is assigned to box2
      // System.out.println(box.l + " "+box.w+" "+box.h);
       // BoxWeight box3 = new BoxWeight();
       // System.out.println(box3.h+" "+box3.weight);

        Box box5 = new BoxWeight(2,3,4,8);
        System.out.println(box5.w);



    }

    public static class Box {
        double l;
        double h;
        double w;

        Box(){
            this.h = -1;
            this.l = -1;
            this.w = -1;
        }
        //cube
        Box(double side){
            this.w = side;
            this.l = side;
            this.h = side;
        }
        Box(double l, double h, double w){
            this.w = l;
            this.l = h;
            this.h = w;
        }
        Box(Box old){
            this.h = old.h;
            this.l = old.l;
            this.w = old.w;
        }
        public void information(){
            System.out.println("Running the box");
        }


    }

    public static class BoxWeight extends Box {
        double weight;

        public BoxWeight(){
            this.weight = -1;
        }

        public BoxWeight(double l, double h, double w, double weight){
            super(l,h,w);//this is what we call class constructor
            //used to initialize values present in parent class
            this.weight  = weight;

        }
    }
}
