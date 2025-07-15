import java.util.*;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];
        String[] originalTimes = new String[n];

        for (int i = 0; i < n; i++) {
            originalTimes[i] = sc.nextLine();
            times[i] = toMinutes(originalTimes[i]);
        }

        String queryStr = sc.nextLine();
        int query = toMinutes(queryStr);

        // Binary Search
        int left = 0, right = n;
        while (left < right) {
            int mid = (left + right) / 2;
            if (times[mid] > query) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        if (left == n) {
            System.out.println("No train");
        } else {
            System.out.println(originalTimes[left]);
        }
    }

    private static int toMinutes(String timeStr) {
        String[] parts = timeStr.split(":");
        return Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
    }
}
    /*
     * Time Complexity: O(log n)
     * 說明：將時間轉換後使用二分搜尋找出下一班車時間，因此為 O(log n)
     */