import java.util.*;
public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();              // 總場數
        int[] a = new int[n];              // 原始勝敗陣列
        int[] ps = new int[n + 1];         // 前綴和陣列（多一格，ps[0] = 0）

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();           // 讀入勝敗資料
        }

        for (int i = 1; i <= n; i++) {
            ps[i] = ps[i - 1] + a[i - 1];  // 前綴和計算
        }

        int k = sc.nextInt();              // 要查詢前 k 場
        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + ps[i]);
        }
        System.out.println(); // 換行
    }
}
/*
 * Time Complexity: O(n)
 * 說明：
 * - 一次走訪輸入陣列 a[]，計算 prefix sum 陣列 ps[]：O(n)
 * - 查詢前 k 個 prefix sum：O(k)，但 k <= n，所以整體仍為 O(n)
 */
