package ru.itsjava;

public class CycleHW {
    public static void main(String[] args) {

//        int count = 0;
//        while (count < 10) {
//            System.out.println((count + 1) + ") " + "I Love Java!");
//            count++;
//        }
//
//        int[] numb = new int[]{0, 2, 5, 6, -9, 3, 7, 8, 2, 6};
//        System.out.println(numb[3] + "," + numb[5]);
//        System.out.println("Lenght = " + numb.length);
//
//        for (count = 0; count < 3; count++) {
//            System.out.println("I Love programing in Java!");
//        }
//
//        System.out.print("Array: {");
//        for (count = 0; count < numb.length-1; count++) {
//            System.out.print(numb[count] + ", ");
//        }
//        System.out.print(numb[numb.length-1]+"}");


//        1. Вывести элементы массива с нечетными индексами. (Индексы 1, 3, 5 и т.д.)
//
//        2. Вывести первые 4 элемента массива.
//
//        3. Вывести последние 4 элемента массива.
//        Давай разберем ответы задач на примере:
//
//        Есть массив {5, 8, 10, 12, 15}
//
//        1.  В консоль выведем:  8  12
//
//        2. В консоль выведем:  5  8  10  12
//
//        3. В консоль выведем:  8  10  12  15

//        int[] numbersArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        System.out.println("\n1.");
//        for (int i = 1; i < numbersArray.length; i += 2) {
//            System.out.print(numbersArray[i] + " ");
//        }
//
//        System.out.println("\n2.");
//        int count = 0;
//        while (count < 4) {
//            System.out.print(numbersArray[count] + " ");
//            count++;
//        }
//
//        System.out.println("\n3.");
//
//        for (int i = numbersArray.length - 4; i < numbersArray.length; i++) {
//            System.out.print(numbersArray[i] + " ");
//
//        }

//        1. Найти минимальный элемент массива
//
//        2. Вывести элементы массива, делящиеся на 5
//
//        3. Найти сумму элементов массива с четными индексами
//
//        4. Найти первый элемент массива, делящийся на 5
//
//
//
//        Давай разберем ответы задач на примере:
//
//        Есть массив {5, -8, 10, 0, -12, 15}
//
//        1. В консоль выведем:  -12
//
//        2. В консоль выведем: 5 10 15
//
//        3. В консоль выведем:   3   (5 + 10 - 12)
//
//        (0 - четное число😉)
//
//        4. В консоль выведем:   5

        int[] array = new int[]{5, -8, 10, 0, -12, 15, -100};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min: " + min + "\n");


        System.out.println("2. ");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 5) == 0) {
                System.out.print(array[i] + " ");
            }
        }

        System.out.println("\n3. ");
        int sum = 0;
        for (int i = 0; i < array.length; i += 2) {
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println("\nsum: " + sum);


        System.out.println("\n4. ");
        for (int i = 0; i < array.length; i++) {
            if ((array[i] % 5) == 0) {
                System.out.print(array[i] + " ");
                break;
            }
        }



    }
}

