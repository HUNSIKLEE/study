package test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("숫자를 입력하세요");
        while (true) {

            try {

                int a = Integer.parseInt(sc.nextLine());

                if (a % 2 == 0) {
                    System.out.println("짝 수 입니다.");
                } else {
                    System.out.println("홀 수 입니다.");
                }

            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        }

    }

}
