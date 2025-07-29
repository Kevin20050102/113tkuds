
import java.util.*;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入回補時刻數 n：");
        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];

        System.out.println("請依序輸入 " + n + " 個 HH:mm 時刻（已遞增）：");
        for (int i = 0; i < n; i++) {
            String[] t = sc.nextLine().split(":");
            times[i] = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
        }

        System.out.print("請輸入查詢時刻（HH:mm）：");
        String[] q = sc.nextLine().split(":");
        int query = Integer.parseInt(q[0]) * 60 + Integer.parseInt(q[1]);

        int left = 0, right = n - 1, ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > query) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (ans == -1) {
            System.out.println("No bike");
        } else {
            System.out.printf("%02d:%02d\n", times[ans] / 60, times[ans] % 60);
        }
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：使用二分搜尋查找第一個大於查詢時間的回補時刻。
 */
