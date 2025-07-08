import java.util.Scanner;

public class printname9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double num = sc.nextDouble();        
        System.out.printf("%.2f\n", num);       

        sc.close();
    }
}
