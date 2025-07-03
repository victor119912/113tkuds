import java.util.Scanner;

public class oj12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        scanner.close();

        for (int row = 1; row <= height; row++) {
            // 先印從 1 到 row 的數字
            for (int num = 1; num <= row; num++) {
                System.out.print(num);
                // 不是最後一個就印空格
                if (num < row) System.out.print(" ");
            }
            // 接著印從 row-1 回到 1
            for (int num = row - 1; num >= 1; num--) {
                System.out.print(" " + num);
            }
            System.out.println();
        }
    }
}
