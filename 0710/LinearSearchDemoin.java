import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchDemoin {
    static int linearSearch(int[] array, int target) {
        int comparisons = 0;
        for (int i = 0; i < array.length; i++) {
            comparisons++;
            System.out.printf("第 %d 次比較：array[%d] = %d，目標值 = %d\n",
                              comparisons, i, array[i], target);
            if (array[i] == target) {
                System.out.printf("找到目標值！總共比較了 %d 次\n", comparisons);
                return i;
            }
        }
        System.out.printf("找不到目標值，總共比較了 %d 次\n", comparisons);
        return -1;
    }

    static int[] linearSearchAll(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (value == target) count++;
        }
        if (count == 0) return new int[0];

        int[] result = new int[count];
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                result[idx++] = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("請輸入陣列（以空格分隔，例如：64 25 12 22）：");
        String line = sc.nextLine().trim();
        String[] parts = line.split("\\s+");
        int n = parts.length;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            try {
                numbers[i] = Integer.parseInt(parts[i]);
            } catch (NumberFormatException e) {
                System.out.printf("錯誤：'%s' 不是有效整數，預設為 0。\n", parts[i]);
                numbers[i] = 0;
            }
        }

        System.out.println("輸入的陣列為：" + Arrays.toString(numbers));

        System.out.print("請輸入要搜尋的目標值（整數）：");
        int target;
        try {
            target = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("輸入錯誤，預設目標值為 0。");
            target = 0;
        }

        System.out.println("\n=== 基本線性搜尋 ===");
        int first = linearSearch(numbers, target);
        if (first != -1) {
            System.out.printf("在索引位置 %d 找到目標值 %d\n", first, target);
        } else {
            System.out.printf("找不到目標值 %d\n", target);
        }

        System.out.println("\n=== 搜尋所有符合位置 ===");
        int[] all = linearSearchAll(numbers, target);
        if (all.length > 0) {
            System.out.printf("目標值 %d 出現在以下位置：", target);
            for (int i = 0; i < all.length; i++) {
                System.out.print(all[i] + (i < all.length - 1 ? ", " : ""));
            }
            System.out.printf("\n總共出現 %d 次\n", all.length);
        } else {
            System.out.printf("找不到目標值 %d\n", target);
        }

        sc.close();
    }
}
