package com.andersen;

import java.io.IOException;
import java.util.Random;

public class Main {
    private final static int iteration = 1000000;

    public static void main(String[] args) {
            testTimeString();
            testTimeBuffer();
            testTimeBuilder();
    }

    private static void testTimeString() {
        Random random = new Random();
        String sString = new String("Тест1 ");

        long before = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            int r = random.nextInt(10);
            sString.concat(String.valueOf(r));
        }
        long after = System.currentTimeMillis();
        System.out.println(sString.getClass().getSimpleName() + ": " + (after - before) + "ms.");
    }

    public static void testTimeBuffer () {
        Random random = new Random();
        StringBuffer sBuffer = new StringBuffer("Тест2 ");

        long before = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            int r = random.nextInt(10);
            sBuffer.append(r);
        }
        long after = System.currentTimeMillis();
        System.out.println(sBuffer.getClass().getSimpleName() + ": " + (after - before) + "ms.");
    }

    public static void testTimeBuilder (){
        Random random = new Random();
        StringBuilder sBuilder = new StringBuilder("Тест3 ");
        long before = System.currentTimeMillis();
        for (int i = 0; i < iteration; i++) {
            int r = random.nextInt(10);
            sBuilder.append(r);
        }
        long after = System.currentTimeMillis();
        System.out.println(sBuilder.getClass().getSimpleName() + ": " + (after - before) + "ms.");
    }
}
