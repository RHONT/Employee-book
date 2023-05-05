package Java_Core.Home_Work_10;

import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        print("Задача 1");
        print("Введите год");
        int year = checkIntAndEnter();

        if (isLeapYear(year)) {
            print(year + " год является високосным");
        } else print(year + " год не является високосным");

        print("-".repeat(40));
    }

    private static void task2() {
        print("Задача 2");

        for (; ; ) {
            print("Введите тип операционной системы. [0 - iOS, 1 - Android] ");
            byte typeOs = checkByteAndEnter();
            print("Введите годы выпуска телефона");
            int year = checkIntAndEnter();
            if (scanDevice(typeOs, year)) {
                break;
            }
        }
        print("-".repeat(40));
    }


    private static void task3() {
        print("Задача 3");

        print("Введите дистанцию в км");
        int deliveryDistance = checkIntAndEnter();
        calcDistance(deliveryDistance);

        print("-".repeat(40));
    }

    private static void calcDistance(int deliveryDistance) {

        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней:" + 1 + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней:" + 2 + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:" + 3 + " дня");
        } else System.out.println("Доставки в такую даль не делаем");


    }


    private static boolean scanDevice(byte typeOs, int year) {

        String articlePhone = String.valueOf(typeOs);
        if (year < 2015) articlePhone += "old";
        {
            switch (articlePhone) {
                case "0":
                    System.out.println("Установите версию приложения для iOS по ссылке");

                    return true;
                case "0old":
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    return true;
                case "1":
                    System.out.println("Установите версию приложения для Android по ссылке");
                    return true;
                case "1old":
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    return true;
                default:
                    System.out.println("Неверный идентификатор операционный системы ");
                    return false;
            }
        }
    }

    private static boolean isLeapYear(int year) {
        if (new GregorianCalendar().isLeapYear(year)) {
            return true;
        } else return false;
    }

    private static void print(String str) {
        System.out.println(str);

    }

    private static byte checkByteAndEnter() {
        while (true) {
            try {
                byte result = sc.nextByte();
                return result;
            } catch (InputMismatchException e) {
                System.out.println("Тип вводимого значения не входит в диапазон Byte");
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }

    private static int checkIntAndEnter() {
        while (true) {
            try {
                int result = sc.nextInt();
                return result;
            } catch (InputMismatchException e) {
                System.out.println("Тип вводимого значения не входит в диапазон Integer");
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }

}