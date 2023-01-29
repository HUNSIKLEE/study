package baekjoon;

import java.util.Scanner;

public class Main_ex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine().strip();

        String result[] = str.split(" ");


                if (result.length == 0) {
                    System.out.println(0);
                    System.exit(0);
                }
                if (result[0] == "") {
                    System.out.println(result.length - 1);
                } else {
                    System.out.println(result.length);
                }
            }

 }
