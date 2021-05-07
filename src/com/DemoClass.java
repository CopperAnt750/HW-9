package com;

public class DemoClass {

    public void methodA () throws ExeptionA {
        boolean flag = true;
        if(flag) throw new ExeptionA();
    }
    public  void methodB () throws ExeptionB {
        boolean flag = true;
        if(flag) throw new ExeptionB();
    }
}
