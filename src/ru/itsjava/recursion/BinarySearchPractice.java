package ru.itsjava.recursion;

import java.util.Arrays;

public class BinarySearchPractice {
    public static void main(String[] args) {
        //1. Отсортированный массив
        // найти: позицию эл-та в этом массиве

        int[] array = new int[]{-6, -2, 0, 1, 5, 7, 9, 10};

        int pos0 = binarySearch(10, 0, array.length, array);
        System.out.println("Позиция 0 в массиве " + Arrays.toString(array) + " равна " + pos0);
    }

    private static int binarySearch(int num, int beginInx, int endInd, int[] array) {
        int midInx = beginInx + (endInd - beginInx) / 2;

        //базовый случай
        if (num == array[midInx]) return midInx;

        if (num > array[midInx]) return binarySearch(num, midInx + 1, array.length, array);

        return binarySearch(num, beginInx, midInx - 1, array);


    }
}
