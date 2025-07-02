public class countloops {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        int count = 0;

        for (int i = 1; i<= n; i++){
            System.err.println("第" +i+"次回圈,sum = "+sum+"+"+i);
            sum += i;
            count++;
        }
        System.err.println("總和為：" + sum);
        System.err.println("加法執行了 "+ count + " 次");
    }
}
