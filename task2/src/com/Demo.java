package com;

import java.util.Scanner;

public class Demo {
    public static int div(int firstInteger, int secondInteger) throws ArithmeticException {
        return firstInteger / secondInteger;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();

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


    }
}
