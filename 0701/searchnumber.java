import java.util.Scanner;

public class searchnumber {
    public static void main(String[] args) {
        int[] s = {1,3,5,7,9,11,13};
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入要查找的數字");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++){
            System.out.println("請輸入第" +i+ "次要找的數字:");
            int x = scanner.nextInt();
            boolean found = false;
            for(int num : s) {
                if (num == x){
                    found = true;
                    break;
                }
            }
                    if (found){
                        System.out.println("第" + i +"次收尋成功");
                    }else{
                        System.out.println("第"+i+"次收尋失敗");
                    }
                   
            }
        }
     }
   
        
    
