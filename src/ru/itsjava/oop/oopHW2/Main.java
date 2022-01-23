package ru.itsjava.oop.oopHW2;

import ru.itsjava.oop.oopHW2.figure.Figure;
import ru.itsjava.oop.oopHW2.figure.Rectangle;
import ru.itsjava.oop.oopHW2.figure.Squat;
import ru.itsjava.oop.oopHW2.figure.Triangle;
import ru.itsjava.oop.oopHW2.person.Man;
import ru.itsjava.oop.oopHW2.person.Person;
import ru.itsjava.oop.oopHW2.person.Woman;

public class Main {
    public static void main(String[] args) {

        Person dima = new Man("Dima", 29);
        Person olga = new Woman("Olga", 32);
        Person lena = new Woman("Elena", 33);

        dima.printAge();
        olga.printAge();


        Person[] persons = new Person[]{dima, olga, lena};

        System.out.println("Array: ");
        for (Person pers : persons) {
            pers.printAge();
        }

        Figure sq = new Squat("Black Squat", 10);
        Figure tr = new Triangle("White Triangle", 3, 4, 5);
        Figure rect = new Rectangle("Red Rectangle", 2, 5);

        sq.perimeter();
        sq.area();

        tr.perimeter();
        tr.area();

        rect.perimeter();
        rect.area();


    }
}
