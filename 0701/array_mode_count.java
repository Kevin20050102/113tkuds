public class array_mode_count {
    public static void main(String[] args) {
        int[] arr = {3, 7, 3, 1, 1, 1};

        int mode = arr[0]; 
        int maxCount = 0;  

        System.out.println("比對過程：");

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr.length; j++) {
                System.out.println("比對 arr[" + i + "] = " + arr[i] + " 和 arr[" + j + "] = " + arr[j]);
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            System.out.println("數字 " + arr[i] + " 出現次數：" + count);

            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        System.out.println("\n眾數為：" + mode + "，出現次數：" + maxCount);
    }
}
