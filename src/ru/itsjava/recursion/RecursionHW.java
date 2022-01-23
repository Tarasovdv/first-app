package ru.itsjava.recursion;

public class RecursionHW {
    public static void main(String[] args) {


        //1 2 3 4 5 6  7   8   9   10
        //1 1 2 3 5 8  13  21  34  55
        System.out.println("fibonachi(2) = " + fibonachi(2));
        System.out.println("fibonachi(1) = " + fibonachi(1));
        System.out.println("fibonachi(3) = " + fibonachi(3));
        System.out.println("fibonachi(5) = " + fibonachi(5));
        System.out.println("fibonachi(10) = " + fibonachi(10));
        System.out.println("fibonachi(0) = " + fibonachi(0));
        System.out.println("fibonachi(-6) = " + fibonachi(-6));


    }

    private static int fibonachi(int n) {

        if (n == 0) return 0;
        if (n < 0) return fibonachi((n + 2)) - fibonachi((n + 1)); // отрицательные числа Фибоначи
        //базовый случай
        if ((n == 1) || (n == 2)) return 1;
        //шаг рекурсии
        return fibonachi((n - 2)) + fibonachi((n - 1));


    }
}
