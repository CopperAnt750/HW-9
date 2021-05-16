package com;

import java.io.FileReader;
import java.io.IOException;

public class Demo {

    private static void simpleNullCheck(String str1) {
        System.out.println(str1.length());
    }

    public static void main(String[] args) {

        // TASK 1
        DemoClass demoClass = new DemoClass();
        String input1 = null;

        try {
            demoClass.methodA();
        } catch (ExeptionA exeptionA) {
            exeptionA.printStackTrace();
        }
        try {
            demoClass.methodB();
        } catch (ExeptionB exeptionB) {
            exeptionB.printStackTrace();
        }

        try {
            simpleNullCheck(input1);
        } catch (Exception nullPointerException) {
            nullPointerException.printStackTrace();
        }

        try (FileReader reader = new FileReader("notes3.txt")) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}
