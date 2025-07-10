public class StudentGradeSystem {
    public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }
    public static void printReport(int[] scores) {
        int sum = 0;
        double average;
        int max = scores[0], min = scores[0];
        int maxIndex = 0, minIndex = 0;

        int countA = 0, countB = 0, countC = 0, countD = 0;
        int countAboveAverage = 0;

        char[] grades = new char[scores.length];
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;
            grades[i] = getGrade(score);

            switch (grades[i]) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
            }

            if (score > max) {
                max = score;
                maxIndex = i;
            }
            if (score < min) {
                min = score;
                minIndex = i;
            }
        }

        average = (double) sum / scores.length;

        for (int score : scores) {
            if (score > average) countAboveAverage++;
        }

        double aboveAvgPercent = (double) countAboveAverage / scores.length * 100;
        System.out.println("=== 學生成績報告 ===");
        System.out.println("---------------------------");
        System.out.printf("總人數：%d%n", scores.length);
        System.out.printf("平均分數：%.2f%n", average);
        System.out.printf("最高分：%d（學生編號 %d）%n", max, maxIndex);
        System.out.printf("最低分：%d（學生編號 %d）%n", min, minIndex);
        System.out.printf("等級統計：A=%d B=%d C=%d D=%d%n", countA, countB, countC, countD);
        System.out.printf("高於平均的人數：%d (%.1f%%)%n", countAboveAverage, aboveAvgPercent);
        System.out.println("---------------------------");
        System.out.printf("%-10s %-10s %-10s%n", "學生編號", "分數", "等級");
        System.out.println("---------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d %-10d %-10c%n", i, scores[i], grades[i]);
        }
    }

    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        printReport(scores);
    }
}
