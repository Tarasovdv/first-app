package ru.itsjava.methods;

public class MethodsPractice {
    public static void main(String[] args) {


        printMaxValue(5, 8);

        System.out.println("Максимум из 3 и 12");

        System.out.println("(getMaxValue(3,12) + 10) = " + (getMaxValue(3, 12) + 10));
//        int num1 = 5;
//        int num2 = 7;
//
//        if (num1 > num2) {
//            System.out.println("max: num1 = " + num1);
//        } else {
//            System.out.println("Max: num2 = " + num2);
//        }
//
//        int num3 = 6;
//        int num4 = 10;
//
//        if (num3 > num4) {
//            System.out.println("max: num3 = " + num3);
//        } else {
//            System.out.println("Max: num4 = " + num4);
//        }

    }

    public static void printMaxValue(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("max: = " + num1);
        } else {
            System.out.println("Max: = " + num2);
        }

    }

    public static int getMaxValue(int num1, int num2) {
        if (num1 > num2) return num1;
        return num2;

    }
}
