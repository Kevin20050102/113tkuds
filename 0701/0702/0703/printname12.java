import java.util.Scanner;

public class printname12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i <= N; i++) {
            // 建立一個字串暫存每一行的數字
            StringBuilder line = new StringBuilder();

            // 遞增部分：1 到 i
            for (int j = 1; j <= i; j++) {
                line.append(j).append(" ");
            }

            // 遞減部分：i-1 到 1
            for (int j = i - 1; j >= 1; j--) {
                line.append(j);
                if (j != 1) {
                    line.append(" ");
                }
            }

            // 輸出去除結尾空格的行
            System.out.println(line.toString().trim());
        }
    }
}
