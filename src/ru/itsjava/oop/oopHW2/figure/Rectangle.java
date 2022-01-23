package ru.itsjava.oop.oopHW2.figure;

public class Rectangle extends Figure{

    private final String name;
    private int side1;
    private int side2;


    public Rectangle(String name,int side1,int side2) {
        this.name = name;
        this.side1 = side1;
        this.side2 = side2;
    }

    public String getName(){
        return name;
    }

    public void perimeter() {
        System.out.print(getName()+" : ");
        System.out.print(" /Perimeter:" + ((side1 * 2) + (side2 * 2)));
    }

    public void area() {
        System.out.println(" /Area:" + (side1 * side2));
    }
}
