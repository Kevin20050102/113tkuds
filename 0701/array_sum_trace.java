public class array_sum_trace {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};

        int sum = 0;  

        System.out.println("加總過程：");
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("第 " + (i + 1) + " 次加總：目前總和 = " + sum);
        }

        System.out.println("陣列元素總和為：" + sum);
    }
}

    

