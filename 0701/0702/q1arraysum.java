import java.util.Scanner;

public class q1arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 讀取 n
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 讀取 n 個整數
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 計算總和與操作次數
        int sum = 0;
        int ops = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
            ops++;
        }

        // 輸出結果
        System.out.println(sum);
        System.out.println(ops);

        sc.close();
    }
}


