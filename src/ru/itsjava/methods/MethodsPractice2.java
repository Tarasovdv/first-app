package ru.itsjava.methods;

import java.util.Arrays;

public class MethodsPractice2 {
    public static void main(String[] args) {
        int[] array = new int[]{-1, 0, 5, 6, 7, -100};
        int num = 5;

        arrayToZeroArray(array);
        System.out.println(Arrays.toString(array));

        num = numbToZero();
        System.out.println("num = " + num);


    }

    public static void arrayToZeroArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }

    public static int numbToZero() {
        return 0;
    }
}
