import java.util.Scanner;

public class printname16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // 輸入陣列元素
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 反轉陣列
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }

        // 輸出反轉後的陣列
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
            if (i < n - 1) System.out.print(" ");
        }
    }
}
