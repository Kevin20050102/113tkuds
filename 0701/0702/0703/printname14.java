import java.util.Scanner;

public class printname14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];

        int top = 0, bottom = N - 1;
        int left = 0, right = N - 1;
        int num = 1;

        while (num <= N * N) {
            // 向右 →
            for (int i = left; i <= right && num <= N * N; i++) {
                matrix[top][i] = num++;
            }
            top++;

            // 向下 ↓
            for (int i = top; i <= bottom && num <= N * N; i++) {
                matrix[i][right] = num++;
            }
            right--;

            // 向左 ←
            for (int i = right; i >= left && num <= N * N; i--) {
                matrix[bottom][i] = num++;
            }
            bottom--;

            // 向上 ↑
            for (int i = bottom; i >= top && num <= N * N; i--) {
                matrix[i][left] = num++;
            }
            left++;
        }

        // 輸出矩陣
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j]);
                if (j < N - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
