package test;

import java.util.Scanner;

public class Test8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            while (true){
                try {
                    System.out.println("정수를 입력해주세요.");
                    int a = Integer.parseInt(sc.nextLine());

                    System.out.println("나눌 정수를 입력해주세요.");
                    int b = Integer.parseInt(sc.nextLine());

                    if (b == 0) {
                        System.out.println("0으로 나눌수 없습니다.");
                    } else {
                        int c = a / b;
                        System.out.println(a + "/" + b + "=" + c);
                    }

                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }
    }
