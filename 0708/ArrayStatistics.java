public class ArrayStatistics {
    public static void main(String[] args) {
        // 1. 建立陣列
        int[] numbers = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        // 變數宣告
        int sum = 0;
        double average = 0.0;
        int max = numbers[0];
        int min = numbers[0];
        int maxIndex = 0;
        int minIndex = 0;
        int countAboveAverage = 0;
        int evenCount = 0;
        int oddCount = 0;

        // 計算總和、最大值、最小值
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];

            if (numbers[i] > max) {
                max = numbers[i];
                maxIndex = i;
            }

            if (numbers[i] < min) {
                min = numbers[i];
                minIndex = i;
            }
        }

        // 計算平均值
        average = (double) sum / numbers.length;

        // 計算大於平均值、偶數與奇數
        for (int num : numbers) {
            if (num > average) {
                countAboveAverage++;
            }

            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // 輸出結果
        System.out.println("+---------------------------+");
        System.out.printf("| %-20s | %5d |\n", "總和", sum);
        System.out.printf("| %-20s | %5.2f |\n", "平均值", average);
        System.out.printf("| %-20s | %5d |\n", "最大值", max);
        System.out.printf("| %-20s | %5d |\n", "最大值索引位置", maxIndex);
        System.out.printf("| %-20s | %5d |\n", "最小值", min);
        System.out.printf("| %-20s | %5d |\n", "最小值索引位置", minIndex);
        System.out.printf("| %-20s | %5d |\n", "大於平均值的數字數", countAboveAverage);
        System.out.printf("| %-20s | %5d |\n", "偶數數量", evenCount);
        System.out.printf("| %-20s | %5d |\n", "奇數數量", oddCount);
        System.out.println("+---------------------------+");
    }
}
