package ru.itsjava;

import java.util.Scanner;

public class IfHW {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

//        System.out.println("Введите число A: ");
//        int a = console.nextInt();
//        System.out.println("Число А = " + a);
//        System.out.println("\nВведите число B: ");
//        int b = console.nextInt();
//        System.out.println("Число B = " + b);
//
//
//        System.out.println("1. Max.");
//        if (a > b) {
//            System.out.println("Max: A = " + a);
//        } else {
//            System.out.println("Max: B = " + b);
//        }


//        System.out.println("Введите число A: ");
//        int a = console.nextInt();
//        System.out.println("Число А = " + a);
//        System.out.println("\nВведите число B: ");
//        int b = console.nextInt();
//        System.out.println("Число B = " + b);
//        System.out.println("\nВведите число C: ");
//        int c = console.nextInt();
//        System.out.println("Число C = " + c);
//
//        System.out.println("2. Min.");
//        if (a <= b && a <= c) {
//            System.out.println("Min: A = " + a);
//        }
//        else if (b <= c && b <= a) {
//            System.out.println("Min: B = " + b);
//        }
//        else if (c <= b && c <= a) {
//            System.out.println("Min: C = " + c);
//        }

//        System.out.println("3. Prizivnik");
//        System.out.println("Input Age:");
//        int age = console.nextInt();
//        System.out.println("Age: " + age);
//
//        if (age<=0 || age>=100){
//            System.out.println("Age error!");
//        }
//        else if (age>0 && age<18){
//            System.out.println("Early");
//        }
//        else if (age>=18 && age<=27){
//            System.out.println("Welcom to the ARMY! ");
//        }
//        else if (age>27 && age<100){
//            System.out.println("Late!");
//        }

//        System.out.println("5. SWAP");
//        System.out.println("Input num1");
//        int num1 = console.nextInt();
//        System.out.println("Input num2");
//        int num2 = console.nextInt();
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);
//        System.out.println("swap solution");
//
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//        System.out.println("num1 = " + num1);
//        System.out.println("num2 = " + num2);


        System.out.println("6. Quadratic equation");
        System.out.println("Input coefficients");
        System.out.println("Input A:");
        double a = console.nextDouble();
        System.out.println("Input B:");
        double b = console.nextDouble();
        System.out.println("Input C:");
        double c = console.nextDouble();
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
        System.out.println("solution");
        double d = (b * b) - (4 * a * c);
        if (d > 0) {
            System.out.println("two roots:");
            System.out.println("x1 = " + ((-b + Math.sqrt(d)) / (2 * a)));
            System.out.println("x2 = " + ((-b - Math.sqrt(d)) / (2 * a)));
        } else if (d == 0) {
            System.out.println("one root:");
            double x = (((-1) * b) / (2 * a));
            System.out.println("x = " + x);
        } else if (d < 0) {
            System.out.println("Quadratic equation don't have roots");
        }

    }
}
