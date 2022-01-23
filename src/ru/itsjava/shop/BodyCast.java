package ru.itsjava.shop;

import java.util.Scanner;

public class BodyCast {
    public static void main(String[] args) {

        String[] product = new String[]{"Скульптура", "Слепок", "Мерч"};
        System.out.println("Приветствуем тебя в нашем мире искусств!");
        printMenu();

        System.out.println("Введите номер меню: ");
        Scanner console = new Scanner(System.in);
        int menuNum = console.nextInt();

        while (true) {
            if (menuNum == 1) {

                printProduct(product);

            } else if (menuNum == 2) {

                product = addProduct(console, product);

            } else if (menuNum == 3) {

                product = removeProduct(console, product);

            } else if (menuNum == 4) {

                bubbleSort(product);

            } else if (menuNum == 0) {
                System.out.println("До скорых встреч!");
                System.exit(0);
            }

            System.out.println("Введите номер меню: ");
            menuNum = console.nextInt();
        }

    }

    private static String[] removeProduct(Scanner console, String[] product) {
        System.out.println("Удалить услугу или товар: ");
        System.out.println("Введите название товара: ");
        String inputProduct = console.next();
        String[] resArr = new String[product.length - 1];

        int removeInx;
        for (removeInx = 0; removeInx < product.length; removeInx++) {
            if (product[removeInx].equals(inputProduct)) break;
            resArr[removeInx] = product[removeInx];
        }

        for (int i = removeInx; i < resArr.length; i++) {
            resArr[i] = product[i + 1];
        }
        return resArr;
    }

    private static void bubbleSort(String[] product) {

        for (int j = 0; j < product.length; j++) {
            for (int i = 0; i < product.length - 1 - j; i++) {
                if (product[i].charAt(0) > product[i + 1].charAt(0)) {
                    String temp = product[i];
                    product[i] = product[i + 1];
                    product[i + 1] = temp;
                }

            }
        }

    }

    private static String[] addProduct(Scanner console, String[] product) {
        System.out.println("Добавьте новую услугу или товар: ");
        System.out.println("Введите название товара: ");
        String inputProduct = console.next();
        String[] resArr = new String[product.length + 1];

        for (int i = 0; i < product.length; i++) {
            resArr[i] = product[i];
        }
        resArr[product.length] = inputProduct;
        return resArr;

    }

    private static void printProduct(String[] product) {
        System.out.println("Товары и услуги: \n");
        for (int i = 0; i < product.length; i++) {
            System.out.println(product[i]);
        }
    }

    public static void printMenu() {
        System.out.println("\n|          1         |           2           |            3         |       4       |   0   |");
        System.out.println("| Все товары и услуги| Добавить товар/услугу | Удалить товар/услугу | Отсортировать | Выход |");
    }
}

//меню
//1 вывести все товары и услуги
//2 добавить товары и услуги
//3 удалить тов и усл
//4 отсортировать
//0 выход
