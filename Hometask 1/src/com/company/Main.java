package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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
                        int elMas = scan.nextInt();
                        System.out.println("Массив" + ": " + Arrays.toString(initMassive(elMas)));
                        System.out.println("Средее арифметическое" + ": " + getAverage(initMassive(elMas)));
                        System.out.println("=======================================");
                        break;
                    }
                    case 2: {
                        System.out.print("Введите число для факториала: ");
                        int a = scan.nextInt();
                        System.out.println("Факториал числа " + a + " = " + factorial(a));

                        break;
                    }
                    case 3: {
                        System.out.print("Введите количество элементов для ряда Фибоначчи: ");
                        int f1 = scan.nextInt();
                        System.out.println("Ряд Фибоначчи с " + f1 + " элементов" + ": " + Arrays.toString(fibonachi(f1)));
                        break;
                    }
                    case 4:
                        System.out.print("Введите номер телефона: ");
                        String str = scan.next();
                        validator(str);
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

    public static int[] initMassive(int elMas){
        Random random = new Random();
        int mas[] = new int[elMas];
        int i;
        for (i = 0; i < mas.length; i++) {
            mas[i] = random.nextInt(20);
        }
        return mas;
    }

    public static double getAverage(int mas[]){
        double sum = 0;
        double average = 0;
        for (int i = 0; i < mas.length; i++) {
            sum = sum + mas[i];
        }
        average = sum / mas.length;
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


    public static int validator (String str) {
        int sum = 0;
        if ((str.length() > 13) || (str.length() < 10) || (str.matches("[\\D]+"))) {
            System.out.println("Не корректный номер!");
        }
        else {
            for (int i = 0; i < str.length(); i++) {
                if (Character.isDigit(str.charAt(i))) {
                    sum += Integer.parseInt(String.valueOf(str.charAt(i)));
                }
            }
            System.out.println("Cумма чисел в строке" + " = " + sum);
            retSumStr(sum);
        }
        return sum;
    }

    public static int retSumStr(int sum) {
        int itSum = 0;
        String strItSum = "";
        strItSum = Integer.toString(sum);
        int j=1;
        while (strItSum.length() > 1) {
            itSum = 0;
            for (int i = 0; i < strItSum.length(); i++) {
                itSum += Integer.parseInt(String.valueOf(strItSum.charAt(i)));
            }
            strItSum = Integer.toString(itSum);
            System.out.println("Итерация " + j + " = " + strItSum);
            j++;
        }
        System.out.println("Результат = " + retResult(itSum));
        return itSum;
    }

    public static String retResult(int sum3) {
        String res = "";
        if (sum3 == 1){
            res = "Один";
        }
        else
        if (sum3 == 2) {
            res = "Два";
        }
        else
        if (sum3 == 3){
            res = "Три";
        }
        else
        if (sum3 == 4){
            res = "Четыре";
        }
        else
        if (sum3 == 5){
            res = "Пять";
        }
        else
        if (sum3 == 6){
            res = "Шесть";
        }
        else
        if (sum3 == 7){
            res = "Семь";
        }
        else
        if (sum3 == 8){
            res = "Восемь";
        }
        else {
            res = "Девять";
        }
        return res;
    }
}
