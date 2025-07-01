public class matrixMultiplication {
    
    public static void main(String[] args){
        int[][] a = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int [][] b = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int [][] result = new int [3][3];

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                for (int k = 0; k < 3;k++){
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.println("計算 c[" +i+ "][" +j+"]");
                for(int k = 0; k <3; k++){
                    int partial = a[i][k] * b[k][j];
                    System.out.println(
                        "a[" +i+"][" +k+ "] * b[" +k+"][" +j+"] = "+a[i][k]+
                        "*" + b[k][j] + "=" +partial);
                        result[i][k] += partial;
                }
                System.out.println("=> result[" +i+"][" +j+"]= "+ result[i][j]);
                System.out.println();
            }
        }
        System.out.println("矩陣相乘結果");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(result[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
        
    
        
    
