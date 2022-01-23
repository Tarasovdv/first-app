package ru.itsjava.methods;

import java.util.Scanner;

public class MethodsHW2 {
    public static void main(String[] args) {


//        printMaxTwoValues();

        printMin3Values();
    }

    private static void printMin3Values() {
        System.out.println("2. Min.");
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = console.nextInt();
        System.out.println("Число А = " + a);
        System.out.println("\nВведите число B: ");
        int b = console.nextInt();
        System.out.println("Число B = " + b);
        System.out.println("\nВведите число C: ");
        int c = console.nextInt();
        System.out.println("Число C = " + c);

        if (a <= b && a <= c) {
            System.out.println("Min: A = " + a);
        }
        else if (b <= c && b <= a) {
            System.out.println("Min: B = " + b);
        }
        else if (c <= b && c <= a) {
            System.out.println("Min: C = " + c);
        }
    }

    private static void printMaxTwoValues() {
        System.out.println("1. Max.");
        Scanner console = new Scanner(System.in);
        System.out.println("Введите число A: ");
        int a = console.nextInt();
        System.out.println("Число А = " + a);
        System.out.println("\nВведите число B: ");
        int b = console.nextInt();
        System.out.println("Число B = " + b);

        if (a > b) {
            System.out.println("Max: A = " + a);
        } else {
            System.out.println("Max: B = " + b);
        }
    }
}
