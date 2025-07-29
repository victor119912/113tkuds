import java.util.*;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(":");
            int hour = Integer.parseInt(parts[0]);
            int minute = Integer.parseInt(parts[1]);
            times[i] = hour * 60 + minute;
        }

        String[] qParts = sc.nextLine().split(":");
        int query = Integer.parseInt(qParts[0]) * 60 + Integer.parseInt(qParts[1]);

        int left = 0, right = n - 1;
        int answer = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > query) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (answer == -1) {
            System.out.println("No bike");
        } else {
            int hr = times[answer] / 60;
            int min = times[answer] % 60;
            System.out.printf("%02d:%02d\n", hr, min);
        }
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：因為是用二分搜尋找比查詢時間大的第一個時刻，所以每次搜尋都把範圍砍半，效率是 log 級數。
 */
