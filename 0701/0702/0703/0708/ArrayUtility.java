import java.util.Arrays;

public class ArrayUtility {

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
    public static void reverseArray(int[] array) {
        int left = 0, right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    public static int findSecondLargest(int[] array) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num < first) {
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        int[] original = {3, 7, 1, 9, 4, 6, 8, 2, 5};

        System.out.println("原始陣列：");
        printArray(original);

        int[] copy = copyArray(original);
        System.out.println("複製的陣列：");
        printArray(copy);
        reverseArray(original);
        System.out.println("反轉後的原始陣列：");
        printArray(original);

        int secondLargest = findSecondLargest(copy);
        System.out.println("第二大的數值：" + secondLargest);
    }
}
