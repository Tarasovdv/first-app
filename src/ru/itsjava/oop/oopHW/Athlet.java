package ru.itsjava.oop.oopHW;

public class Athlet {
    private final String name;
    private int age;
    private String contry;

    public Athlet(String name, int age, String contry) {
        this.name = name;
        this.age = age;
        this.contry = contry;
    }

    public Athlet(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public Athlet(String name) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getContry() {
        return contry;
    }
}
