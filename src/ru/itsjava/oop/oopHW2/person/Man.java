package ru.itsjava.oop.oopHW2.person;

public class Man extends Person {

    private String name;
    private int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public void printAge() {
        System.out.print(getName());
        System.out.println(" - Реальный возраст: " + getAge());
    }
}
