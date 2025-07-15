import java.util.Scanner;

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalStops = input.nextInt();
        String[] stationList = new String[totalStops];

        // 讀取停靠站
        for (int idx = 0; idx < totalStops; idx++) {
            stationList[idx] = input.next();
        }

        String startStation = input.next();
        String endStation = input.next();

        int startIndex = -1;
        int endIndex = -1;

        // 找起點與終點站位置
        for (int i = 0; i < totalStops; i++) {
            if (stationList[i].equals(startStation)) {
                startIndex = i;
            }
            if (stationList[i].equals(endStation)) {
                endIndex = i;
            }
        }

        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid");
        } else {
            int result = Math.abs(startIndex - endIndex) + 1;
            System.out.println(result);
        }

        input.close();
    }
}

/*
 * Time Complexity: O(n)
 * 因為最多只需要掃一次全部站點，就能找出起點和終點的位置。
 */
