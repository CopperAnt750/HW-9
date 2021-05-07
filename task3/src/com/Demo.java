package com;

public class Demo {
    public static void someMethod() throws Exception {
        someMethod2();
    }

    public static void someMethod2() throws Exception {
//        throw new Exception();
        someMethod3();
    }
    public static void someMethod3() throws Exception {
        throw new Exception();
    }

    public static void main(String[] args) {

        try {
            someMethod3();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
