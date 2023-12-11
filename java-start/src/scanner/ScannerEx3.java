package scanner;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("음식 이름을 입력해주세요: ");
        String foodName = scanner.nextLine();

        System.out.println("음식의 가격을 입력해주세요: ");
        int foodPrice = scanner.nextInt();

        System.out.println("음식의 수량을 입력해주세요.");
        int foodQty = scanner.nextInt();

        int sum = foodPrice * foodQty;

        System.out.println(foodName + foodQty +"개 를 주문 하셨습니다. 총 가격은 " + sum +"원 입니다." );

    }
}
