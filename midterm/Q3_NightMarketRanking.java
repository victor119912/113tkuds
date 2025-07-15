import java.util.Scanner;

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int stallCount = input.nextInt();
        double[] scores = new double[stallCount];

        // 讀取各攤位分數
        for (int i = 0; i < stallCount; i++) {
            scores[i] = input.nextDouble();
        }

        // 選擇排序：由大到小
        for (int i = 0; i < stallCount - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < stallCount; j++) {
                if (scores[j] > scores[maxIdx]) {
                    maxIdx = j;
                }
            }

            // 交換
            double tmp = scores[i];
            scores[i] = scores[maxIdx];
            scores[maxIdx] = tmp;
        }

        // 輸出前 5 名（不足 5 則全列）
        int limit = Math.min(5, stallCount);
        for (int i = 0; i < limit; i++) {
            System.out.printf("%.1f\n", scores[i]);
        }

        input.close();
    }
}

/*
 * Time Complexity: O(n^2)
 * 外層迴圈跑 n-1 次，每次都找剩下最大值，屬於選擇排序，故時間複雜度為 O(n²)。
 */
