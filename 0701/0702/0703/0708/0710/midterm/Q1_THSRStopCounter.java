import java.util.Scanner;
public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 站數
        String[] stations = new String[n];
        for (int i = 0; i < n; i++) {
            stations[i] = sc.next();
        }

        String start = sc.next();
        String end = sc.next();

        int startIdx = -1;
        int endIdx = -1;

        for (int i = 0; i < n; i++) {
            if (stations[i].equals(start)) startIdx = i;
            if (stations[i].equals(end)) endIdx = i;
        }

        if (startIdx == -1 || endIdx == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(startIdx - endIdx) + 1);
        }
    }
}
    /*
     * Time Complexity: O(n)
     * 說明：單次線性走訪陣列找出起點與終點站的索引，因此時間複雜度為 O(n)
     */