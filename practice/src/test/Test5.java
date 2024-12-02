package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            System.out.println("숫자를 입력해주세요.");
        while (true) {
            int n = Integer.parseInt(sc.nextLine());


            if (n < 0) {
                System.out.println("음 수 입니다.");
            } else if (n == 0) {
                System.out.println("0 입니다.");
            } else {
                System.out.println("양 수 입니다.");
            }
        }
    }
}
