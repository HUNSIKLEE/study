package baekjoon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();

        if(a > b){
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");

        }else {
            System.out.println("==");
        }


    }

}
