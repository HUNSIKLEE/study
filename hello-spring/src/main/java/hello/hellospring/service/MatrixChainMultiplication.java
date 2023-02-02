package hello.hellospring.service;
import java.util.Scanner;

public class MatrixChainMultiplication {

    private static int[][] dp;

    private static int minMul(int[] arr, int i, int j) {
        if (dp[i][j] != Integer.MAX_VALUE) {
            return dp[i][j];
        }
        if (i + 1 == j) {
            return 0;
        }
        for (int k = i + 1; k < j; k++) {
            int mul = minMul(arr, i, k) + minMul(arr, k, j) + arr[i] * arr[k] * arr[j];
            dp[i][j] = Math.min(dp[i][j], mul);
        }
        return dp[i][j];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int[] arr = new int[N + 1];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                arr[i + 1] = sc.nextInt();
            }
            dp = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    dp[i][j] = Integer.MAX_VALUE;
                }
            }
            int result = minMul(arr, 0, N - 1);
            System.out.println(result >= Integer.MAX_VALUE ? -1 : result);
        }
        sc.close();
    }
}