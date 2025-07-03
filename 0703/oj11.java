import java.util.Scanner;

public class oj11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int col = 0; col < M; col++) {
            int sum = 0;
            for (int row = 0; row < N; row++) {
                sum += arr[row][col];
            }
            System.out.print(sum);
            if (col != M - 1) {
                System.out.print(" ");
            }
        }
    }
}
