package ru.itsjava.oop.oopHW2.figure;


public class Circle extends Figure{

    public final String name;
    public final static double PI = 3/14;
    public int radius;

    public Circle(String name, int radius) {
        this.name = name;
        this.radius = radius;
    }


    public void perimeter() {
        System.out.print(" /Perimeter:" + (2*PI*radius));
    }

    public void area() {
        System.out.println(" /Area:" + (PI*(radius^radius)));
    }
}
