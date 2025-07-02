import java.util.Scanner;

public class q1arraysum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // 讀入陣列長度
        int[] arr = new int[n];
        int sum = 0;
        int ops = 0;               // 加法操作次數

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            ops++;
        }

        System.out.println(sum);
        System.out.println(ops);
    }
}
