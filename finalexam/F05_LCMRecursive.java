import java.util.*;

public class F05_LCMRecursive {
    public static int gcd(int a, int b) {
        if (a == b) return a;
        return a > b ? gcd(a - b, b) : gcd(a, b - a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入兩個正整數 a b：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int lcm = a * b / gcd(a, b);
        System.out.println("LCM: " + lcm);
    }
}

/*
 * Time Complexity: O(max(a, b))
 * 說明：輾轉相減法最壞情況每次只減 1，最多遞迴 max(a, b) 次。
 */
