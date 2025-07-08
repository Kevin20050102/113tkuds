public class GradeProcessor {
    public static void main(String[] args) {
        int[] grades = {78, 85, 92, 67, 88, 95, 73, 90};

        int sum = 0;
        double average;
        for (int grade : grades) {
            sum += grade;
        }
        average = (double) sum / grades.length;
        System.out.printf("總分: %d%n", sum);
        System.out.printf("平均: %.2f%n", average);

        int max = grades[0], min = grades[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 1; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
                maxIndex = i;
            }
            if (grades[i] < min) {
                min = grades[i];
                minIndex = i;
            }
        }

        System.out.printf("最高分: %d (索引: %d)%n", max, maxIndex);
        System.out.printf("最低分: %d (索引: %d)%n", min, minIndex);

        int aboveAverageCount = 0;
        for (int grade : grades) {
            if (grade > average) {
                aboveAverageCount++;
            }
        }
        System.out.printf("超過平均分的人數: %d%n", aboveAverageCount);

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("學生 %d: %d%n", i, grades[i]);
        }
    }
}

