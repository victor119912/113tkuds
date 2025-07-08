public class ArraySearcher {

    // 2. 搜尋目標數值的方法
    public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // 找到就回傳索引
            }
        }
        return -1; // 沒找到
    }

    // 4. 計算目標數值出現次數的方法
    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int value : array) {
            if (value == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        // 1. 建立陣列
        int[] numbers = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};

        // 5. 測試搜尋數字 67 和 100
        int target1 = 67;
        int target2 = 100;

        int index1 = findElement(numbers, target1);
        int index2 = findElement(numbers, target2);

        System.out.println("搜尋數字 " + target1 + " 的結果: 索引 = " + index1);
        System.out.println("搜尋數字 " + target2 + " 的結果: 索引 = " + index2);

        System.out.println("數字 " + target1 + " 出現次數: " + countOccurrences(numbers, target1));
        System.out.println("數字 " + target2 + " 出現次數: " + countOccurrences(numbers, target2));
    }
}
