import java.util.Scanner;

public class q7permutation {
    static int ops = 0; // 
    static void permute(int[] arr, int l, int r) {
        if (l == r) {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i < arr.length - 1) System.out.print(" ");
            }
            System.out.println();
            ops++; 
        } else {
            for (int i = l; i <= r; i++) {
                swap(arr, l, i);
                permute(arr, l + 1, r);
                swap(arr, l, i);
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i + 1;

        permute(arr, 0, n - 1); 

        System.out.println(ops); 

        sc.close();
    }
}
