package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("입력 받을 숫자의 개수를 입력하세요.");
        int n = scanner.nextInt();

        int[] num = new int[n];
        int min, max;

        System.out.println(n + " 게수의 정수를 입력하세요");
        for (int i = 0; i < n; i++) {
            num[i] = scanner.nextInt();
        }

        min = max = num[0];

        for (int i = 1; i < n; i++) {
            if (num[i] < min) {
                min = num[i];
            }
            if (num[i] < max) {
                max = num[i];
            }
        }
        System.out.println(" 가장 작은 정수 " + min);
        System.out.println(" 가장 큰 정수 " + max);
    }
}
