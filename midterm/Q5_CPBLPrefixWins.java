import java.util.Scanner;

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalGames = input.nextInt();
        int[] results = new int[totalGames];
        int[] prefixSum = new int[totalGames + 1]; // 多留一格方便

        for (int i = 0; i < totalGames; i++) {
            results[i] = input.nextInt();
        }

        int k = input.nextInt();

        // 計算前綴和
        for (int i = 1; i <= totalGames; i++) {
            prefixSum[i] = prefixSum[i - 1] + results[i - 1];
        }

        // 印出前 k 場結果
        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) {
            System.out.print(" " + prefixSum[i]);
        }
        System.out.println();

        input.close();
    }
}

/*
 * Time Complexity: O(n)
 * 建立 prefix sum 陣列需要走一次全部比賽結果，時間是 O(n)。
 * 查詢前 k 場直接輸出，額外時間 O(k) 也屬於 O(n) 級別。
 */
