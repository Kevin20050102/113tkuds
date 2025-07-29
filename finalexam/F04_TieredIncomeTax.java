import java.util.*;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入收入筆數 n：");
        int n = sc.nextInt();
        long totalTax = 0;

        System.out.println("請輸入 " + n + " 筆年收入金額：");
        for (int i = 0; i < n; i++) {
            int income = sc.nextInt();
            int tax = 0;
            if (income <= 560000) tax = (int)(income * 0.05);
            else if (income <= 1260000) tax = (int)(income * 0.12 - 39200);
            else if (income <= 2520000) tax = (int)(income * 0.20 - 140000);
            else if (income <= 4720000) tax = (int)(income * 0.30 - 392000);
            else tax = (int)(income * 0.40 - 864000);
            totalTax += tax;
            System.out.println("Tax: $" + tax);
        }

        System.out.println("Average: $" + (totalTax / n));
    }
}

/*
 * Time Complexity: O(n)
 * 說明：逐筆計算稅額，總共處理 n 筆資料，時間複雜度為 O(n)。
 */
