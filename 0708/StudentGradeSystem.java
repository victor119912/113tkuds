public class StudentGradeSystem {
    public static void main(String[] args) {
        
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};

        
        int countA = 0, countB = 0, countC = 0, countD = 0;
        int sum = 0;
        int maxScore = scores[0], minScore = scores[0];
        int maxIndex = 0, minIndex = 0;

        
        char[] grades = new char[scores.length];

        
        for (int i = 0; i < scores.length; i++) {
            int score = scores[i];
            sum += score;

            
            if (score >= 90) {
                grades[i] = 'A';
                countA++;
            } else if (score >= 80) {
                grades[i] = 'B';
                countB++;
            } else if (score >= 70) {
                grades[i] = 'C';
                countC++;
            } else {
                grades[i] = 'D';
                countD++;
            }

            
            if (score > maxScore) {
                maxScore = score;
                maxIndex = i;
            }
            if (score < minScore) {
                minScore = score;
                minIndex = i;
            }
        }

        double average = (double) sum / scores.length;

        
        int aboveAverageCount = 0;
        for (int score : scores) {
            if (score > average) {
                aboveAverageCount++;
            }
        }
        double aboveAveragePercentage = (double) aboveAverageCount / scores.length * 100;

        
        printReport(scores, grades, countA, countB, countC, countD, maxScore, minScore, maxIndex, minIndex, average, aboveAveragePercentage);
    }

    public static void printReport(int[] scores, char[] grades, int countA, int countB, int countC, int countD,
                                   int maxScore, int minScore, int maxIndex, int minIndex,
                                   double average, double aboveAveragePercentage) {
        System.out.println("========= 學生成績報告 =========");
        System.out.printf("總人數: %d\n", scores.length);
        System.out.printf("平均分數: %.2f\n", average);
        System.out.printf("A 等級人數: %d\n", countA);
        System.out.printf("B 等級人數: %d\n", countB);
        System.out.printf("C 等級人數: %d\n", countC);
        System.out.printf("D 等級人數: %d\n", countD);
        System.out.printf("最高分: %d (學生編號: %d)\n", maxScore, maxIndex);
        System.out.printf("最低分: %d (學生編號: %d)\n", minScore, minIndex);
        System.out.printf("高於平均分的比例: %.2f%%\n", aboveAveragePercentage);
        System.out.println("================================");

        System.out.println(String.format("%-10s%-10s%-10s", "學生編號", "分數", "等級"));
        System.out.println("--------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%-10d%-10d%-10c\n", i, scores[i], grades[i]);
        }
        System.out.println("================================");
    }
}
