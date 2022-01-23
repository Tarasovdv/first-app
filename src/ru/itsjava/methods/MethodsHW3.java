package ru.itsjava.methods;

import java.util.Arrays;
import java.util.Scanner;

public class MethodsHW3 {
    public static void main(String[] args) {

        int[] numbersArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Main Array:");
        System.out.println(Arrays.toString(numbersArray));

        System.out.println("\n\n1.");
        printOddIndexValues(numbersArray);

        System.out.println("\n\n2.");
        printFirst4Elements(numbersArray);

        System.out.println("\n\n3.");
        printLast4Elements(numbersArray);

        System.out.println("\n\n4.");
        printMinArrElement(numbersArray);

        System.out.println("\n\n5.");
        printArrElementsDivBy5(numbersArray);

        System.out.println("\n\n6.");
        printSumElemEvenIndx(numbersArray);

        System.out.println("\n\n7.");
        printFirstElemArrDivBy5(numbersArray);

        System.out.println("\n\nIFHW: ");
        Scanner scan = new Scanner(System.in);
        int a = 5;
        int b = 7;
        int c = -6;

        printMax(a, b);
        printMin(a, b, c);

//        System.out.println("\nPrizivnik");
//        System.out.println("Input Age:");
//        int age = scan.nextInt();
//        prizivnik(age);


        System.out.println("\n5. SWAP");
        swap(a,b);

        System.out.println("\n6. Quadratic equation");

        quadraticEquation(a, b, c);


    }

    private static void quadraticEquation(int a, int b, int c) {
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

    private static void swap(int num1,int num2) {
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("SWAP solution");

        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

    private static void prizivnik(int age) {
        System.out.println("Age: " + age);

        if (age<=0 || age>=100){
            System.out.println("Age error!");
        }
        else if (age>0 && age<18){
            System.out.println("Early");
        }
        else if (age>=18 && age<=27){
            System.out.println("Welcom to the ARMY! ");
        }
        else if (age>27 && age<100){
            System.out.println("Late!");
        }
    }

    private static void printMin(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.println("Min: A = " + a);
        } else if (b <= c && b <= a) {
            System.out.println("Min: B = " + b);
        } else if (c <= b && c <= a) {
            System.out.println("Min: C = " + c);
        }
    }

    private static void printMax(int a, int b) {
        if (a > b) {
            System.out.println("Max: A = " + a);
        } else {
            System.out.println("Max: B = " + b);
        }
    }

    private static void printFirstElemArrDivBy5(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 5) == 0) {
                System.out.print(array[i] + " ");
                break;
            }
        }
    }

    private static void printSumElemEvenIndx(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println("\nsum: " + sum);
    }

    private static void printArrElementsDivBy5(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 5) == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    private static void printMinArrElement(int[] numbersArray) {
        int min = numbersArray[0];
        for (int i = 1; i < numbersArray.length; i++) {
            if (numbersArray[i] < min) {
                min = numbersArray[i];
            }
        }
        System.out.println("min: " + min + "\n");
    }

    private static void printLast4Elements(int[] numbersArray) {
        for (int i = numbersArray.length - 4; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + " ");
        }
    }

    private static void printFirst4Elements(int[] numbersArray) {
        int count = 0;
        while (count < 4) {
            System.out.print(numbersArray[count] + " ");
            count++;
        }
    }

    private static void printOddIndexValues(int[] numbersArray) {
        for (int i = 1; i < numbersArray.length; i += 2) {
            System.out.print(numbersArray[i] + " ");
        }
    }
}
