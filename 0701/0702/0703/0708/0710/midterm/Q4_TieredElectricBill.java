import java.util.*;
public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            int kWh = sc.nextInt();
            int fee = calc(kWh);
            total += fee;
            System.out.println("Bill: $" + fee);
        }

        int avg = Math.round((float) total / n);
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + avg);
    }

    public static int calc(int kWh) {
        int fee = 0;
        int remain = kWh;

        if (remain > 1000) {
            fee += (remain - 1000) * 846 / 100;
            remain = 1000;
        }
        if (remain > 700) {
            fee += (remain - 700) * 624 / 100;
            remain = 700;
        }
        if (remain > 500) {
            fee += (remain - 500) * 504 / 100;
            remain = 500;
        }
        if (remain > 330) {
            fee += (remain - 330) * 370 / 100;
            remain = 330;
        }
        if (remain > 120) {
            fee += (remain - 120) * 245 / 100;
            remain = 120;
        }
        if (remain > 0) {
            fee += remain * 168 / 100;
        }

        return fee;
    }
}
/*
 * Time Complexity: O(n)
 * 說明：共處理 n 筆輸入資料，每筆計算 calc(kWh)，
 * calc 函式最多 6 段，為固定時間 O(1)，
 * 整體時間複雜度為 O(n)。
 */
