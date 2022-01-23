package ru.itsjava.oop.oopHW2.person;

public class Woman extends Person {
    private String name;
    private int age;

    public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void printAge(){
        System.out.print(getName());
        System.out.println(" - Ever 18 years! " );
    }
}
