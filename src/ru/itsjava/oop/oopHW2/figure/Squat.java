package ru.itsjava.oop.oopHW2.figure;

public class Squat extends Figure {
    private final String name;
    private int side;

    public Squat(String name, int side) {
        this.name = name;
        this.side = side;
    }

    public String getName(){
        return name;
    }

    public void perimeter() {
        System.out.print(getName()+" : ");
        System.out.print(" /Perimeter:" + (side * 4));
    }

    public void area() {
        System.out.println(" /Area:" + (side ^ 2));
    }
}
