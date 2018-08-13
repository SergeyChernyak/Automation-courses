package com.andersen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static void main(String[] args) {
        Set<String> setFirst = new HashSet<>();
        setFirst.add("123");
        setFirst.add("124");
        setFirst.add("125");

        Set<String> setSecond = new HashSet<>();
        setSecond.add("123");
        setSecond.add("111");
        setSecond.add("222");

        Realizations realizationObject = new Realizations();

        System.out.println("Input set A: " + ANSI_YELLOW + setFirst + ANSI_RESET + ";");
        System.out.println("Input set B: " + ANSI_YELLOW + setSecond + ANSI_RESET + ";");

        if (realizationObject.equals(setFirst, setSecond)) {
            System.out.println(ANSI_GREEN + "Result equals: " + ANSI_RESET + "Set A and B consist of the same value;");
        }
        else {
            System.out.println(ANSI_GREEN + "Result equals: " + ANSI_RESET + "Set A and B consist of different value;");
        }

        System.out.println(ANSI_GREEN + "Result union: " + ANSI_RESET + realizationObject.union(setFirst, setSecond) + ";");
        System.out.println(ANSI_GREEN + "Result subtract: " + ANSI_RESET + realizationObject.subtract(setFirst, setSecond) + ";");
        System.out.println(ANSI_GREEN + "Result intersect: " + ANSI_RESET + realizationObject.intersect(setFirst, setSecond) + ";");
        System.out.println(ANSI_GREEN + "Result symmetric subtract: " + ANSI_RESET + realizationObject.symmetricSubtract(setFirst, setSecond) + ".");
    }
}
