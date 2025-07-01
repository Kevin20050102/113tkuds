public class matrix_multiplication_trace {
    public static void main(String[] args) {
   
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] result = new int[2][2]; 

        System.out.println("矩陣相乘逐步運算過程：");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                result[i][j] = 0; 
                System.out.print("result[" + i + "][" + j + "] = ");
                for (int k = 0; k < 2; k++) {
                    int mul = a[i][k] * b[k][j];
                    result[i][j] += mul;
                    System.out.print("a[" + i + "][" + k + "] * b[" + k + "][" + j + "] = "
                                     + a[i][k] + "*" + b[k][j] + " = " + mul);
                    if (k < 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println(" => " + result[i][j]);
            }
        }

        System.out.println("\n結果矩陣為：");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(result[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
