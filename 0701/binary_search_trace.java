import java.util.Scanner;

public class binary_search_trace {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};

        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入要搜尋的目標值：");
        int target = scanner.nextInt();

        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        System.out.println("\n二元搜尋比對過程：");

        while (left <= right) {
            int mid = (left + right) / 2;

            System.out.print("left = " + left + ", right = " + right + ", mid = " + mid);
            System.out.println(" → arr[mid] = " + arr[mid]);

            if (arr[mid] == target) {
                System.out.println("找到目標值 " + target + "，位於索引 " + mid + "。");
                found = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (!found) {
            System.out.println("找不到目標值 " + target + "。");
        }

        scanner.close();
    }
}
