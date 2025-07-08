public class ArraySearcher {
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};
        int index67 = findElement(numbers, 67);
        int count67 = countOccurrences(numbers, 67);
        System.out.println("搜尋 67 => 索引: " + index67 + "，出現次數: " + count67);

        int index100 = findElement(numbers, 100);
        int count100 = countOccurrences(numbers, 100);
        System.out.println("搜尋 100 => 索引: " + index100 + "，出現次數: " + count100);
    }
}
