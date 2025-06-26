public class ds_05 {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, 3, 7, 15, 20, 1, 6, 9};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("陣列中所有元素的總和為：" + sum);
    }
}

