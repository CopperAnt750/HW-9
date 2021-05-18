package com;

import java.util.Scanner;

public class SafeDivision {
    public static int div(int firstInteger, int secondInteger) throws ArithmeticException {
        return firstInteger / secondInteger;
    }

    public static void main(String[] args) {
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        for (; ; ) {
            if (!in.hasNextInt()) {
                System.out.println("Enter integer vale");
                in.next();
                continue;
            }
            a = in.nextInt();
            break;
        }
        System.out.print("Input the second number: ");
        for (; ; ) {
            if (!in.hasNextInt()) {
                System.out.println("Enter integer vale");
                in.next();
                continue;
            }
            b = in.nextInt();
            break;
        }
        try {
            System.out.println("Result: " + div(a, b));
        } catch (ArithmeticException arithmeticException) {
            int c = 0;
            while (c == 0) {
                System.out.println("Reenter the correct value of B");
                c = in.nextInt();
            }
            System.out.println("Result: " + div(a, c));
        }
        in.close();
    }
}
