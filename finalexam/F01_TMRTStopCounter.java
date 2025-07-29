import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 站數
        String[] stops = new String[n];
        for (int i = 0; i < n; i++) {
            stops[i] = sc.next();
        }

        String start = sc.next();
        String end = sc.next();

        int startIndex = -1;
        int endIndex = -1;

        for (int i = 0; i < n; i++) {
            if (stops[i].equals(start)) {
                startIndex = i;
            }
            if (stops[i].equals(end)) {
                endIndex = i;
            }
        }

        if (startIndex == -1 || endIndex == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(startIndex - endIndex) + 1);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：程式只需要一次 for 迴圈去找 start 和 end 的位置，最多掃過整個輸入一次，屬於線性時間。
 */
