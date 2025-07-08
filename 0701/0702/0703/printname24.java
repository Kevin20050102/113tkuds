import java.util.Scanner;
public class printname24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();  
        scanner.close();

        int result = 1;
        int i = 1;

        while (i <= N) {
            result *= i;
            i++;
        }

        System.out.println(result);
    }
}


