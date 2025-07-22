import java.util.Scanner;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入 n（費波納契第幾項）：");
        int n = sc.nextInt();
        System.out.println("第 " + n + " 項為：" + fibonacci(n));
    }
}
