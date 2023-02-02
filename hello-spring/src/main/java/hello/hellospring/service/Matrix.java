package hello.hellospring.service;
import java.util.Scanner;

public class Matrix {
    public static int T, N;
    public static int[] A, B;

    public static int minMultiplications(int[] A, int[] B, int n) {
        int[][] dp = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int q = dp[i][k] + dp[k + 1][j] + A[i] * B[k] * B[j];
                    dp[i][j] = Math.min(dp[i][j], q);
                }
            }
        }

        return (dp[0][n - 1] < Integer.MAX_VALUE) ? dp[0][n - 1] : -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        T = sc.nextInt();
        while (T-- > 0) {
            N = sc.nextInt();
            A = new int[N];
            B = new int[N];
            for (int i = 0; i < N; i++) {
                A[i] = sc.nextInt();
                B[i + 1] = sc.nextInt();
            }
            System.out.println(minMultiplications(A, B, N));
        }
        sc.close();
    }
}