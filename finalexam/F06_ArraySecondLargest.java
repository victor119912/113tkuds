import java.util.*;

public class F06_ArraySecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = findSecondMax(nums, 0, n - 1);
        System.out.println("SecondMax: " + result[1]);
    }

    // 回傳 int[2] => [最大值, 第二大值]
    public static int[] findSecondMax(int[] arr, int left, int right) {
        if (left == right) {
            return new int[]{arr[left], Integer.MIN_VALUE}; // 單一元素
        }

        int mid = (left + right) / 2;
        int[] leftPair = findSecondMax(arr, left, mid);
        int[] rightPair = findSecondMax(arr, mid + 1, right);

        int max1 = leftPair[0], max2 = leftPair[1];
        int r1 = rightPair[0], r2 = rightPair[1];

        int max, second;
        if (max1 > r1) {
            max = max1;
            second = Math.max(r1, max2);
        } else {
            max = r1;
            second = Math.max(max1, r2);
        }

        return new int[]{max, second};
    }
}

/*
 * Time Complexity: O(n)
 * 說明：透過遞迴將陣列不斷對半切，合併時只做幾次比較，整體每個元素只會被處理一次，所以是線性時間。
 */
