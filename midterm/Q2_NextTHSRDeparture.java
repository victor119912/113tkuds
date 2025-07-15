import java.util.Scanner;

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int trainCount = input.nextInt();
        input.nextLine(); // 吃掉換行

        String[] timeList = new String[trainCount];
        int[] timeInMin = new int[trainCount];

        // 讀取班次
        for (int i = 0; i < trainCount; i++) {
            String time = input.nextLine();
            timeList[i] = time;

            String[] parts = time.split(":");
            int h = Integer.parseInt(parts[0]);
            int m = Integer.parseInt(parts[1]);
            timeInMin[i] = h * 60 + m;
        }

        String queryTime = input.nextLine();
        String[] queryParts = queryTime.split(":");
        int queryMin = Integer.parseInt(queryParts[0]) * 60 + Integer.parseInt(queryParts[1]);

        // 二分搜尋找第一個比 query 大的班次
        int left = 0;
        int right = trainCount - 1;
        int ans = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (timeInMin[mid] > queryMin) {
                ans = mid;
                right = mid - 1; // 往左找更小的
            } else {
                left = mid + 1;  // 往右找
            }
        }

        if (ans == -1) {
            System.out.println("No train");
        } else {
            System.out.println(timeList[ans]);
        }

        input.close();
    }
}

/*
 * Time Complexity: O(log n)
 * 使用二分搜尋找下一班班次，因為輸入已排序，搜尋時間是對數時間。
 */
