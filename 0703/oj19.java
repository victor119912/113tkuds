import java.util.Scanner;

public class oj19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        for (int num = 2; num <= N; num++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;  // 有因數，跳出判斷
                }
            }
            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
