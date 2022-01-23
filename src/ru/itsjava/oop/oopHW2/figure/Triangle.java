package ru.itsjava.oop.oopHW2.figure;

public class Triangle extends Figure{

    private final String name;
    private int side1;
    private int side2;
    private int side3;

    public Triangle(String name, int side1, int side2, int side3) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public String getName(){
        return name;
    }

    public void perimeter() {
        System.out.print(getName()+" : ");
        System.out.print(" /Perimeter:" + (side1 + side2 + side3));
    }

    public void area() {
        double p = ((side1 + side2 + side3) / 2);
        double s = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
        System.out.println(" /Area:" + (s));
    }
}
