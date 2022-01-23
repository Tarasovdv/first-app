package ru.itsjava.recursion;

public class RecursionPractice {
    public static void main(String[] args) {

        System.out.println("fact(5) = " + fact(5));

        System.out.println("fact(-1) = " + fact(-1));

    }

    public static int fact(int num) {
        if (num<0){
            System.err.println("Факториал для числа: " + num + " не определен");
            return -1;
        }
        if ((num == 1) || (num == 0)) return 1;

        return num * fact(num - 1);
    }
}
