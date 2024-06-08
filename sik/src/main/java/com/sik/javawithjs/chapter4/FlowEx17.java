package com.sik.javawithjs.chapter4;

import java.util.Scanner;

public class FlowEx17 {
    public static void main(String[] args) {

        int num = 0;

        System.out.println("별(*)을 출력할 라인의 수를  입력하세요");

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        num = Integer.parseInt(s);

        for (int i = 0; i < num; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }

    }
}
