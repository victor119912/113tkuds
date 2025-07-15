import java.util.Scanner;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] scores = new int[n];

        for (int i = 0; i < n; i++) {
            scores[i] = input.nextInt();
        }

        // 計算有多少攤是 5 分
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] == 5) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("None");
            input.close();
            return;
        }

        // 把索引存到新陣列
        int[] fiveStarIdx = new int[count];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            if (scores[i] == 5) {
                fiveStarIdx[idx++] = i;
            }
        }

        // 輸出索引，空格分隔
        for (int i = 0; i < count; i++) {
            System.out.print(fiveStarIdx[i]);
            if (i < count - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        input.close();
    }
}
