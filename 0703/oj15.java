import java.util.Scanner;

public class oj15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] matrix = new int[N][M];

        // 讀取矩陣元素
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        // 輸出轉置矩陣
        for (int j = 0; j < M; j++) {      // 原矩陣列數變成轉置後的行數
            for (int i = 0; i < N; i++) {  // 原矩陣行數變成轉置後的列數
                System.out.print(matrix[i][j]);
                if (i != N - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}
