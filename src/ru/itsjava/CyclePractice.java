package ru.itsjava;

public class CyclePractice {
    public static void main(String[] args) {
//        int count = 0;
//        while (count < 3) {
//            System.out.println("Java Love!");
//            count++;
//        }
//
////        while (true){
////            System.out.println("Infinity cycle!!!");
////        }
//
//        int[] numb = new int[]{0, 1, -5, -9};
//
//        System.out.println(numb[2]);
//        System.out.println(numb[0]);
//        System.out.println(numb.length);
//
//        for (int i = 0; i < numb.length; i++) {
//            System.out.print(numb[i]+" ");
//        }

        int[] numbersArray = new int[]{0, 5, -6, 2, 3, 5, 8,5};
        System.out.println();
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < numbersArray.length; i++){
            if (numbersArray[i] == 5){
                System.out.println(i);
            }
        }


        int count = 0;
        for (int i = 0; i<numbersArray.length;i++){
            if (numbersArray[i] == 5){
                count++;
            }
        }
        System.out.println(count);
    }
}
