package com.sik.javawithjs.chapter2;

public class VarEx2 {

    public static void main(String[] args) {

        int x = 10, y = 20;
        int tmp = 10;
        System.out.println("x = " + x + ", y = " + y);
        System.out.println("tmp = " + tmp);

        tmp = x;
        x = y;
        y = tmp;
        System.out.println("x = " + x + ", y = " + y);

    }
}
