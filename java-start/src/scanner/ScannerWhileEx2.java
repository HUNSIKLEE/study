
package scanner;

import java.util.Scanner;

public class ScannerWhileEx2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("상품의 가격을 입력해주세요: ");
            int foodPrice = scanner.nextInt();

            if(foodPrice == -1){
                System.out.println(" 프로그램을 종료합니다.");
                break;
            }

            System.out.println("구매하려는 수량을 입력해주세요.");
            int foodQty = scanner.nextInt();

            int sum = foodPrice * foodQty;

            System.out.println("총 가격은 " + sum +"원 입니다." );



        }
    }
}
