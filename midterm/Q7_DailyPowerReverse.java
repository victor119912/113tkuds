import java.util.Scanner;

public class Q7_DailyPowerReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] power = new int[7];
        for (int i = 0; i < 7; i++) {
            power[i] = input.nextInt();
        }

        // 反轉陣列，用雙指標交換
        int left = 0;
        int right = power.length - 1;

        while (left < right) {
            int temp = power[left];
            power[left] = power[right];
            power[right] = temp;

            left++;
            right--;
        }

        // 輸出反轉後的陣列
        for (int i = 0; i < power.length; i++) {
            System.out.print(power[i]);
            if (i < power.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

        input.close();
    }
}
