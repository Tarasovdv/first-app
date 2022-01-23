package ru.itsjava.sorting;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {

        int[] arr = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0};

        System.out.println("Исходный: " + Arrays.toString(arr));
        qsort(arr,0, arr.length-1);
        System.out.println("Отсортированный: " + Arrays.toString(arr));
    }

    private static void qsort(int[] arr, int begin, int end) {
        if (arr.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (begin >= end)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = begin + (end - begin) / 2;
        int pivot = arr[middle];

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = begin, j = end;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }

            while (arr[j] > pivot) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (begin < j)
            qsort(arr, begin, j);

        if (end > i)
            qsort(arr, i, end);
    }

}
