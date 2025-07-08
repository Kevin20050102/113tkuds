import java.util.Scanner;
public class printname22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum = 0;

        for (int i = 2; i <= N; i += 2) {  // 直接從2開始，每次加2跳過奇數
            sum += i;
        }

        System.out.println(sum);
    }
}


