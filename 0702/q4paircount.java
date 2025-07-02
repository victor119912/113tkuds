import java.util.Scanner;

public class q4paircount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        // 讀入 n 個數（雖然不使用，但題目格式中會輸入）
        for (int i = 0; i < n; i++) {
            sc.nextInt(); // 忽略值，只消耗輸入
        }

        int pairCount = 0;
        int ops = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                pairCount++;
                ops++;
            }
        }

        System.out.println(pairCount);
        System.out.println(ops);
    }
}
