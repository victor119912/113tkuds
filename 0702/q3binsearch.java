import java.util.Scanner;

public class q3binsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();     // 讀取陣列長度
        int key = sc.nextInt();   // 讀取要找的 key
        int[] arr = new int[n];   // 宣告陣列

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();  // 讀取已排序的陣列
        }

        int left = 0;
        int right = n - 1;
        int ops = 0;     // 操作次數
        int index = -1;  // 結果預設為 -1，表示找不到

        while (left <= right) {
            ops++;  // 每次比較就 +1
            int mid = left + (right - left) / 2;

            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        System.out.println(index);
        System.out.println(ops);
    }
}
