package ru.itsjava;

public class Main {

    public static void main(String[] args) {
        System.out.println("Хочу программировать на Java");

        int num = 5;

        num += 2;
        System.out.println(num);

        double dl = 5.0;
        System.out.println(100.0 / 0.0);
        System.out.println(0.0 / 100.0);
//        System.out.println(5/0);

        boolean isSunny = false;
        System.out.println(isSunny);

        System.out.println("\n Я люблю ДЗ");
        int num1 = 10;
        int num2 = 7;
        System.out.println("num1+num2 = " + (num1 + num2));
        System.out.println("num1-num2 = " + (num1 - num2));
        System.out.println("num1*num2 = " + num1 * num2);
        System.out.println("num1/num2 = " + num1 / num2);
        System.out.println("num1%num2 = " + num1 % num2);
        num1 += 1;
        num2 += 1;
        System.out.println("num1++ = " + num1 + "\n" + "num2++ = " + num2);
        num1 -= 1;
        num2 -= 1;
        System.out.println("num1-- = " + num1 + "\n" + "num2-- = " + num2);

        System.out.println("\nnum1 = " + num1 + "\nnum2 = " + num2);
        System.out.println("num1 > num2 -> " + (num1 > num2));
        System.out.println("num1 < num2 -> " + (num1 < num2));
        System.out.println("num1 >= num2 -> " + (num1 >= num2));
        System.out.println("num1 <= num2 -> " + (num1 <= num2));
        System.out.println("num1 == num2 -> " + (num1 == num2));
        System.out.println("num1 != num2 -> " + (num1 != num2));

        if (true){
            System.out.println("hiiii");
        }

    }
}
