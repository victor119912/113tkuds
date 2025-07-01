public class array_sum_trace {
    public static void main(String[] args) {
        // 固定的整數陣列
        int[] arr = {1, 3, 5};
        int total = 0;

        // 加總過程追蹤
        for (int i = 0; i < arr.length; i++) {
            int before = total;
            total += arr[i];
            System.out.println("加總過程：total = " + before + " + " + arr[i] + " = " + total);
        }

        // 印出總和
        System.out.println("總和為：" + total);
    }
}
