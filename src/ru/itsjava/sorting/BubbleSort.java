package ru.itsjava.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println("Исходный массив: " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {

        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }

            }
        }

    }
}
