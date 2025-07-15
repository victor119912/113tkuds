import java.util.Scanner;

public class Q8_MergeTHSRPriceTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        input.nextLine(); // 吃掉換行

        String[] stations = new String[n];
        int[][] prices = new int[n][2];  // 0: Standard, 1: Business

        for (int i = 0; i < n; i++) {
            String line = input.nextLine();
            String[] parts = line.split("\\s+");
            stations[i] = parts[0];
            prices[i][0] = Integer.parseInt(parts[1]);
            prices[i][1] = Integer.parseInt(parts[2]);
        }

        // 印表頭
        System.out.println("Station|Standard|Business");

        // 印各站票價，固定寬度對齊
        for (int i = 0; i < n; i++) {
            System.out.printf("%-7s|%8d|%8d\n", stations[i], prices[i][0], prices[i][1]);
        }

        input.close();
    }
}
