package ru.itsjava.methods;

import java.util.Scanner;

public class MethodsHW {
    public static void main(String[] args) {


//        System.out.println("getMinimumValue() = " + getMinimumValue());

//        printMinimumValue();
        printEqualValue();
    }

    public static int inputValue() {
        Scanner console = new Scanner(System.in);
        int num = console.nextInt();
        return num;
    }

    public static int getMinimumValue() {
        System.out.println("Введите первое значение: ");
        int num1 = inputValue();
        System.out.println("Num1: = " + num1);

        System.out.println("Введите второе значение: ");
        int num2 = inputValue();
        System.out.println("Num2: = " + num2);

        if (num1 < num2) return num1;
        return num2;
    }

    public static void printMinimumValue() {
        System.out.println("Введите первое значение: ");
        int num1 = inputValue();
        System.out.println("Num1: = " + num1);

        System.out.println("Введите второе значение: ");
        int num2 = inputValue();
        System.out.println("Num2: = " + num2);

        if (num1 < num2) {
            System.out.println("Min: = " + num1);
        } else {
            System.out.println("Min: = " + num2);
        }
    }

    public static void printEqualValue() {
        System.out.println("Введите первое значение: ");
        int num1 = inputValue();
        System.out.println("Num1: = " + num1);

        System.out.println("Введите второе значение: ");
        int num2 = inputValue();
        System.out.println("Num2: = " + num2);

        if (num1 == num2) {
            System.out.println("Равны" );
        } else {
            System.out.println("Не равны");
        }
    }


//        1.  Написать метод по вычислению минимума из двух чисел.
//        2. Написать метод, который печатает минимум из двух чисел.
//        3. Написать метод, который печатает равны или не равны два числа.
}
