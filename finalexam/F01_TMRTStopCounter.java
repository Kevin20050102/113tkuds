
import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入停靠站總數 n：");
        int n = sc.nextInt(); sc.nextLine();

        List<String> stations = new ArrayList<>();
        System.out.println("請輸入 " + n + " 個停靠站代碼（以空格分隔）：");
        String[] input = sc.nextLine().split("\\s+");
        stations.addAll(Arrays.asList(input));

        System.out.print("請輸入起訖站（以空格分隔）：");
        String[] bounds = sc.nextLine().split("\\s+");
        String start = bounds[0], end = bounds[1];

        int index1 = -1, index2 = -1;
        for (int i = 0; i < n; i++) {
            if (stations.get(i).equals(start)) index1 = i;
            if (stations.get(i).equals(end)) index2 = i;
        }

        if (index1 == -1 || index2 == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println("停靠站數（含起訖）： " + (Math.abs(index1 - index2) + 1));
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：一次遍歷清單找出起訖站索引，總共 O(n)。
 */

