package test;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (true) {
        System.out.println("이름을 입력해주세요.");
        String name = sc.nextLine();

            try {
                System.out.println("나이를 입력해주세요.");
                int age = Integer.parseInt(sc.nextLine());

                System.out.println("키를 입력해주세요.");
                int talled = Integer.parseInt(sc.nextLine());

                System.out.println("이름은 " + name + " 나이는 " + age + " 키는 " + talled + " 입니다. ");

            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력가능합니다.");
            }
        }
    }
}
