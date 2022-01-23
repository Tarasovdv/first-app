package ru.itsjava.oop;

public class Lion extends Cat{

    //поля
    private String name;



    //конструктор
    public Lion(){
        System.out.println("Default constructor");
    }

    public Lion (String inputName){

        this.name = inputName;
    }

    public void sayR(){
        System.out.println(name + "RRR");
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
}
