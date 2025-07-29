import java.util.*;

public class F06_ArraySecondLargest {
    public static int[] findSecondMax(int[] arr, int left, int right) {
        if (right - left == 1) {
            int max = Math.max(arr[left], arr[right]);
            int sec = Math.min(arr[left], arr[right]);
            return new int[]{max, sec};
        } else if (left == right) {
            return new int[]{arr[left], Integer.MIN_VALUE};
        }

        int mid = (left + right) / 2;
        int[] leftPair = findSecondMax(arr, left, mid);
        int[] rightPair = findSecondMax(arr, mid + 1, right);

        int max, sec;
        if (leftPair[0] > rightPair[0]) {
            max = leftPair[0];
            sec = Math.max(leftPair[1], rightPair[0]);
        } else {
            max = rightPair[0];
            sec = Math.max(rightPair[1], leftPair[0]);
        }

        return new int[]{max, sec};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入陣列長度 n（n ≥ 2）：");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("請輸入 " + n + " 個整數：");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int[] result = findSecondMax(arr, 0, n - 1);
        System.out.println("SecondMax: " + result[1]);
    }
}

/*
 * Time Complexity: O(n)
 * 說明：遞迴合併兩邊的最大與次大值，每層處理所有元素一次。
 */

