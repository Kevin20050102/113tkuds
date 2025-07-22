import java.util.Scanner;

public class FibonacciCompare {

    // 標準遞迴版本 - 非常慢
    public static int fibonacciSlow(int n) {
        if (n <= 1) return n;
        return fibonacciSlow(n - 1) + fibonacciSlow(n - 2);
    }

    // 記憶化版本 - 快速
    public static int fibonacciFast(int n, int[] memo) {
        if (n <= 1) return n;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibonacciFast(n - 1, memo) + fibonacciFast(n - 2, memo);
        return memo[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入 n（費波納契第幾項）：");
        int n = sc.nextInt();

        // ---- 記憶化版本 ----
        int[] memo = new int[n + 1];
        long startFast = System.nanoTime();
        int resultFast = fibonacciFast(n, memo);
        long endFast = System.nanoTime();
        System.out.println("【fibonacciFast】結果：" + resultFast);
        System.out.println("執行時間：" + (endFast - startFast) / 1_000_000.0 + " ms");

        // ---- 標準遞迴版本 ----
        // 避免太大造成等待太久（可自行調整）
        if (n <= 40) {
            long startSlow = System.nanoTime();
            int resultSlow = fibonacciSlow(n);
            long endSlow = System.nanoTime();
            System.out.println("【fibonacciSlow】結果：" + resultSlow);
            System.out.println("執行時間：" + (endSlow - startSlow) / 1_000_000.0 + " ms");
        } else {
            System.out.println("【fibonacciSlow】n 太大（> 40），為避免長時間等待不執行。");
        }
    }
}
