public class ArrayStatistics {

    public static void main(String[] args) {
        // 1. 建立陣列
        int[] data = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        // 2. 統計分析
        int sum = 0;
        double average;
        int max = data[0], min = data[0];
        int maxIndex = 0, minIndex = 0;
        int aboveAverageCount = 0;
        int evenCount = 0, oddCount = 0;

        // 總和、最大/最小值、偶奇數統計
        for (int i = 0; i < data.length; i++) {
            int num = data[i];
            sum += num;

            if (num > max) {
                max = num;
                maxIndex = i;
            }
            if (num < min) {
                min = num;
                minIndex = i;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // 平均值
        average = (double) sum / data.length;

        // 大於平均的數量
        for (int num : data) {
            if (num > average) {
                aboveAverageCount++;
            }
        }

        // 3. 表格形式輸出
        System.out.println("=== 陣列統計分析結果 ===");
        System.out.printf("%-20s: %d%n", "總和", sum);
        System.out.printf("%-20s: %.2f%n", "平均值", average);
        System.out.printf("%-20s: %d (索引: %d)%n", "最大值", max, maxIndex);
        System.out.printf("%-20s: %d (索引: %d)%n", "最小值", min, minIndex);
        System.out.printf("%-20s: %d%n", "大於平均的數量", aboveAverageCount);
        System.out.printf("%-20s: %d%n", "偶數個數", evenCount);
        System.out.printf("%-20s: %d%n", "奇數個數", oddCount);
    }
}
