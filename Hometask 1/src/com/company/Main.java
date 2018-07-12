package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Random random = new Random();
        // int arr[] = new int[10];
        // int method = 5;

        int method;
        boolean exit;
        exit = true;
            while (exit == true) {
                System.out.println("Меню:");
                System.out.println("1 - Вычисление среднего арифметического массива");
                System.out.println("2 - Вычысление факториала числа");
                System.out.println("3 - Вывод ряда Фибоначчи");
                System.out.println("4 - Валидатор номера телефона");
                System.out.println("5 - Выход");
                System.out.print("Ввыбеете значение для вызова метода: ");
                method = scan.nextInt();
                switch (method) {
                    case 1: {
                        System.out.print("Введите количество элементов массива: ");
                        int el_mas = scan.nextInt();
                        System.out.println("Массив" + ": " + Arrays.toString(init_massive(el_mas)));
                        System.out.println("Средее арифметическое" + ": " + get_average(init_massive(el_mas)));
                        System.out.println("=======================================");
                        break;
                    }
                    case 2: {
                        System.out.print("Введите число для факториала: ");
                        int a = scan.nextInt();
                        //int c = factorial(a);
                        System.out.println("Факториал числа " + a + " = " + factorial(a));
                        System.out.println("=======================================");
                        break;
                    }
                    case 3: {
                        System.out.print("Введите количество элементов для ряда Фибоначчи: ");
                        int f1 = scan.nextInt();
                        //   int arr2[] = fibonachi(f1);
                        System.out.println("Ряд Фибоначчи с " + f1 + " элементов" + ": " + Arrays.toString(fibonachi(f1)));
                        break;
                    }
                    case 4:
                        System.out.println("Еще не реализован");
                        break;
                    case 5:
                        exit = false;
                        break;
                    default:
                        System.out.println("Такого метода не существует");
                        break;
                }
        }

    }


    public static int[] init_massive (int el_mas){
        Random random = new Random();
        int mas[] = new int[el_mas];
        int i;

        for (i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(20);
        }
        return mas;
    }

    public static double get_average (int mas[]){
        double sum = 0;
        double average = 0;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        average = sum / mas.length;
       // System.out.println("Средее арифметическое" + ": " + average);
        return average;
    }

    public static int factorial(int a) {
        int res = 1;
        for (int i = 1; i <= a; i++) {
            res = res * i;
        }
        return res;
    }

    public static int[] fibonachi (int f1) {
        int arr1[] = new int[f1];
        arr1[0] = 0;
        arr1[1] = 1;
        for (int i = 2; i < f1; i++) {
            arr1[i] = arr1[i-2] + arr1[i-1];
        }
        return arr1;
    }


 /*   public static void validator (String str) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        System.out.println(str1);
        int dov_str1 = str1.length();
        if (dov_str1 > 13) {
            System.out.println("Не корректтный телефон");
        }
        else

    }
*/

}
