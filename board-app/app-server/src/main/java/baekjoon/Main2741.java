package baekjoon;

import java.util.Scanner;

public class Main1152 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int str = sc.nextInt();
        sc.close();

        for(int i = 1; i <= str; str--){
//            for(int j = 0; j > i; j++)
            System.out.println(str);
        }

    }
 }
