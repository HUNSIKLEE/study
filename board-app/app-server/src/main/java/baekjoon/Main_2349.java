package baekjoon;

import java.util.Scanner;

public class Main_ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int str = sc.nextInt();

        for(int i = 1; i <= str; i++){
            for (int j = 1; j <= str - i ; j++){
                System.out.print(" ");
            }
            for(int k = 0; k < i ; k++ ){
            System.out.print("*");
            }
            System.out.println();
         }
        }
 }
