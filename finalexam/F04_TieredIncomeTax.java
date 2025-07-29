import java.util.*;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        long[] incomes = new long[n];
        long totalTax = 0;

        for (int i = 0; i < n; i++) {
            incomes[i] = Long.parseLong(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            long income = incomes[i];
            long tax = calculateTax(income);
            System.out.println("Tax: $" + tax);
            totalTax += tax;
        }

        long average = totalTax / n;
        System.out.println("Average: $" + average);
    }

    public static long calculateTax(long income) {
        long tax = 0;
        if (income <= 560000) {
            tax = Math.round(income * 0.05);
        } else if (income <= 1260000) {
            tax = Math.round(560000 * 0.05 + (income - 560000) * 0.12);
        } else if (income <= 2520000) {
            tax = Math.round(560000 * 0.05 + (1260000 - 560000) * 0.12 + (income - 1260000) * 0.20);
        } else if (income <= 4720000) {
            tax = Math.round(560000 * 0.05 + (1260000 - 560000) * 0.12 + 
                             (2520000 - 1260000) * 0.20 + (income - 2520000) * 0.30);
        } else {
            tax = Math.round(560000 * 0.05 + (1260000 - 560000) * 0.12 + 
                             (2520000 - 1260000) * 0.20 + (4720000 - 2520000) * 0.30 +
                             (income - 4720000) * 0.40);
        }
        return tax;
    }
}

/*
 * Time Complexity: O(n)
 * 說明：每筆收入只需要跑一次計算稅額的流程，總共處理 n 筆資料，所以時間會隨輸入成正比。
 */