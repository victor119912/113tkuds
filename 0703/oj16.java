import java.util.Scanner;

public class oj16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        // 反轉輸出
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) System.out.print(" ");
        }
    }
}
