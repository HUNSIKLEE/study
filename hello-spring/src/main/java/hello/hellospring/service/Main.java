package hello.hellospring.service;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int result = 0;
            for (int i = 1; i < n - 1; i++) {
                if (a[i - 1] == a[i + 1]) {
                    result = a[i + 1];
                    break;
                }
            }
            if (result == 0) {
                System.out.println("-1");
            } else {
                System.out.println(result * n);
            }
        }
        sc.close();
    }
}