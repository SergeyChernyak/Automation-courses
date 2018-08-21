package com.andersen;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuffer sBuffer1 = new StringBuffer("Тест 1");
        StringBuilder sBuilder1 = new StringBuilder("Тест2");
        try {
            testTime(sBuffer1);
            testTime(sBuilder1);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void testTime (Appendable obj) throws IOException {
        long before = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            obj.append("");
        }
        long after = System.currentTimeMillis();
        System.out.println(obj.getClass().getSimpleName() + ": " + (after - before) + "ms.");
    }
}
