package com;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivision {
    public static int div(int firstInteger, int secondInteger) throws ArithmeticException {
        return firstInteger / secondInteger;

    }

    public static void main(String[] args) {

        int a = 0;
        int b = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");

        for (;;){
            if (!in.hasNextInt()){
                System.out.println("Enter integer vale");
                in.next();
                continue;
            }
            a = in.nextInt();
            break;
        }
        System.out.print("Input the second number: ");
        for (;;){
            if (!in.hasNextInt()){
                System.out.println("Enter integer vale");
                in.next();
                continue;
            }
            b = in.nextInt();
            break;
        }



//        System.out.print("Input the first number : ");
//        a = in.nextInt();
//        System.out.print("Input the second number: ");
//        b = in.nextInt();

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
