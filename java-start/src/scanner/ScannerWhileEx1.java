
package scanner;

import java.util.Scanner;

public class ScannerWhileEx1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("이름을 입력하세요 (종료를 누르면 종료됩니다.): ");
            String str = scanner.nextLine();
            if(str.equals("종료")){
                break;
            }

            System.out.println("나이를 입력하세요:");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("입력한 이름: " + str + ", 나이: " + age);

        }
    }
}
