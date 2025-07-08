import java.util.Scanner;

public class printname15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // 行數
        int M = scanner.nextInt(); // 列數

        int[][] matrix = new int[N][M];

        // 讀取原始矩陣
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // 輸出轉置矩陣：M行N列
        for (int j = 0; j < M; j++) {
            for (int i = 0; i < N; i++) {
                System.out.print(matrix[i][j]);
                if (i < N - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
