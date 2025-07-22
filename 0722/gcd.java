import java.util.Scanner;

public class gcd {
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入兩個整數 (a b)：");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("最大公因數為：" + gcd(a, b));
    }
}
