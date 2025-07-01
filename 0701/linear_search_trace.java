import java.util.Scanner;

public class linear_search_trace {
    public static void main(String[] args) {
       
        int[] s = {1, 3, 5, 7, 9};
        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入要搜尋的數字：");
        int target = scanner.nextInt();

        boolean found = false;
        System.out.println("比對過程：");

        for (int i = 0; i < s.length; i++) {
            System.out.println("第 " + (i + 1) + " 次比對：s[" + i + "] = " + s[i]);
            if (s[i] == target) {
                found = true;
                System.out.println("找到目標數字 " + target + "，位於索引 " + i + "。");
                break;
            }
        }

        if (!found) {
            System.out.println("找不到目標數字 " + target + "。");
        }

        scanner.close();
    }
}

