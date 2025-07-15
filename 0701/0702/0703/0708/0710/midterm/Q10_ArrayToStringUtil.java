import java.util.*;
public class Q10_ArrayToStringUtil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        int[] arr;
        if (n == -1) {
            arr = null;  
        } else {
            arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
        }

        System.out.println(arrayToString(arr));
    }

    public static String arrayToString(int[] a) {
        if (a == null) return "null";
        if (a.length == 0) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < a.length; i++) {
            sb.append(a[i]);
            if (i != a.length - 1) {
                sb.append(", ");
            }
        }

        sb.append("]");
        return sb.toString();
    }
}
