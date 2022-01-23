package ru.itsjava.oop.oopHW;

public class Main {
    public static void main(String[] args) {

        Lion myfasa = new Lion("Myfasa");
        Lion shram = new Lion("Shram");


        myfasa.sayR();
        shram.sayR();

        Human dima = new Human("Dmitriy", 30);

        dima.greeting();

        Iron lg = new Iron(100);
        System.out.println("Price LG: " + lg.getPrice());

        Iron samsung = new Iron("Samsung",100,"White");
        System.out.println("samsung.getColor() = " + samsung.getColor());
        System.out.println("samsung.getPrice() = " + samsung.getPrice());
        samsung.setPrice(200);
        System.out.println("samsung.getPrice() = " + samsung.getPrice());
    }
}
