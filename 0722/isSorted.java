import java.util.Scanner;

public class isSorted {
    public static boolean isSorted(int[] arr, int index) {
        if (index >= arr.length - 1) return true;
        if (arr[index] > arr[index + 1]) return false;
        return isSorted(arr, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入陣列長度：");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("輸入陣列元素：");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        System.out.println("是否已升序排列：" + isSorted(arr, 0));
    }
}
