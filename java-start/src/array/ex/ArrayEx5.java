package array.ex;

import java.util.Scanner;

public class ArrayEx5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("입력 받을 숫자의 개수를 입력하세요.");
        int count = scanner.nextInt();

        int[] num = new int[count];

        int sum = 0;
        double avg;

        System.out.println(count +"개의 정수를 입력하세요. :");

        for (int i = 0; i < count; i++){
            num[i] = scanner.nextInt();
            sum += num[i];
        }

        avg = (double) sum / count;

        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + avg);
    }
}
