package ru.itsjava.strings;

public class StringPractice {
    public static void main(String[] args) {
        System.out.println("Строка - лучший в мире класс!!!");

        String str = "Я самая лучшая строка";
        String str2 = "Я самая лучшая строка";

        // не правильное стравнение. проверка ссылок
        System.out.println(str==str2);

        // правильное. проверяет содержание
        System.out.println("str.equals(str2) = " + str.equals(str2));

        System.out.println(str.charAt(3));
        System.out.println(str.length());

    }
}
