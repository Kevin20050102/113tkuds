import java.util.Scanner;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        double[] scores = new double[n];

        for (int i = 0; i < n; i++) {
            scores[i] = Double.parseDouble(sc.nextLine());
        }

        // 選擇排序：由大到小排序
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIdx]) {
                    maxIdx = j;
                }
            }
            // 交換
            double temp = scores[i];
            scores[i] = scores[maxIdx];
            scores[maxIdx] = temp;
        }

        // 輸出前 5 名（或不足 5 筆就全輸出）
        for (int i = 0; i < Math.min(5, n); i++) {
            System.out.printf("%.1f\n", scores[i]);
        }
    }
}
    /*
     * Time Complexity: O(n^2)
     * 說明：使用選擇排序，每次從剩下的資料中選出最大值與當前位置交換，
     * 需重複 n 次，每次最多比較 n 次，總計為 n(n-1)/2，屬於 O(n^2)。
     */