import java.util.Scanner;

public class printname17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        if (S >= 90 && S <= 100) {
            System.out.println("A");
        } else if (S >= 80) {
            System.out.println("B");
        } else if (S >= 70) {
            System.out.println("C");
        } else if (S >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
