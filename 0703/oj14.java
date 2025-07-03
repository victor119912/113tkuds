import java.util.Scanner;

public class oj14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int[][] matrix = new int[N][N];
        int num = 1;
        int top = 0, bottom = N - 1;
        int left = 0, right = N - 1;

        while (left <= right && top <= bottom) {
            // 從左到右
            for (int col = left; col <= right; col++) {
                matrix[top][col] = num++;
            }
            top++;

            // 從上到下
            for (int row = top; row <= bottom; row++) {
                matrix[row][right] = num++;
            }
            right--;

            if (top <= bottom) {
                // 從右到左
                for (int col = right; col >= left; col--) {
                    matrix[bottom][col] = num++;
                }
                bottom--;
            }

            if (left <= right) {
                // 從下到上
                for (int row = bottom; row >= top; row--) {
                    matrix[row][left] = num++;
                }
                left++;
            }
        }

        // 輸出結果
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j]);
                if (j != N - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
