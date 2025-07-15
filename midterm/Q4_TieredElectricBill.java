import java.util.Scanner;

public class Q4_TieredElectricBill {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int billCount = input.nextInt();
        int[] bills = new int[billCount];

        int total = 0;

        for (int i = 0; i < billCount; i++) {
            int kWh = input.nextInt();
            int amount = calc(kWh);
            bills[i] = amount;
            total += amount;
        }

        // 印出各筆帳單
        for (int amt : bills) {
            System.out.println("Bill: $" + amt);
        }

        // 印出總和與平均（四捨五入）
        int avg = Math.round((float) total / billCount);
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + avg);

        input.close();
    }

    // 計算單筆電費
    static int calc(int k) {
        double sum = 0;

        if (k > 1000) {
            sum += (k - 1000) * 8.46;
            k = 1000;
        }
        if (k > 700) {
            sum += (k - 700) * 6.24;
            k = 700;
        }
        if (k > 500) {
            sum += (k - 500) * 5.04;
            k = 500;
        }
        if (k > 330) {
            sum += (k - 330) * 3.70;
            k = 330;
        }
        if (k > 120) {
            sum += (k - 120) * 2.45;
            k = 120;
        }
        sum += k * 1.68;

        return (int) Math.round(sum);
    }
}

/*
 * Time Complexity: O(n)
 * 每筆 kWh 都只計算一次段落電費，n 筆迴圈處理，總時間是 O(n)。
 */
