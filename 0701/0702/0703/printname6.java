import java.util.Scanner;

public class printname6
 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intNum = sc.nextInt();           
        double floatNum = sc.nextDouble();   

        double result = intNum + floatNum;  

        System.out.printf("%.2f\n", result); 
        sc.close();
    }
}
