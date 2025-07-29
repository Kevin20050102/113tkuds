import java.util.*;

public class F03_ConvenienceHotItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入商品數量 n：");
        int n = sc.nextInt();
        String[] names = new String[n];
        int[] qtys = new int[n];

        System.out.println("請輸入 " + n + " 行商品名稱與數量（Name Qty）：");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            qtys[i] = sc.nextInt();
        }

        // 插入排序
        for (int i = 1; i < n; i++) {
            int key = qtys[i];
            String nameKey = names[i];
            int j = i - 1;
            while (j >= 0 && qtys[j] < key) {
                qtys[j + 1] = qtys[j];
                names[j + 1] = names[j];
                j--;
            }
            qtys[j + 1] = key;
            names[j + 1] = nameKey;
        }

        System.out.println("熱銷前 10 名商品：");
        for (int i = 0; i < Math.min(10, n); i++) {
            System.out.println(names[i] + " " + qtys[i]);
        }
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：插入排序最壞情況需要 O(n²) 次比較與位移。
 */
