
package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true) {
            System.out.println("정수를 입력하세요. (0입력하면 종료) :");
            int number = scanner.nextInt();

            if (number == 0) {
                System.out.println("프로그램 종료");
                break;
            }

            sum += number;
        }
        System.out.println("입력한 모든 정수의 합: " + sum);
    }
}
