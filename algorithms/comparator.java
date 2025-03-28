package com.rohit.algorithms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.*;

public class comparator {

    public static void main(String[] args) {
       List<Student> student = new ArrayList<>();
       student.add(new Student("Rohit",21,25));
       student.add(new Student("Khatri",22,24));
        student.add(new Student("kishor",20,12));
        student.add(new Student("Milan",19,22));

        Collections.sort(student,new IdComparator());
        System.out.println(student);

        Collections.sort(student,new AgeComparator());
        System.out.println(student);

        Collections.sort(student,new NameComparator());
        System.out.println(student);


    }
}

class Student{
    String name;
    int age;
    int id;

    public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", id=" + id +
                '}';
    }
}

class IdComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return s1.id - s2.id;
    }
}

class AgeComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1, Student s2){
        return s1.age - s2.age;
    }
}

class NameComparator implements Comparator<Student>{
    @Override
    public int compare(Student s1 , Student s2){
        return s1.name.compareTo(s2.name);
    }
}
