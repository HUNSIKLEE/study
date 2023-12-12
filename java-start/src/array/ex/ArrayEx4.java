package array.ex;

import java.util.Scanner;

public class ArrayEx4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] num = new int[5];

        int sum = 0;
        double avg;

        System.out.println("5개의 정수를 입력하세요. :");

        for (int i = 0; i < num.length; i++){
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        avg = (double) sum /5;

        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + avg);
    }
}
