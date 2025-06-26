public class ds_06 {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 89, 34, 22, 90, 11, 78, 65};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("最大值：" + max);
    }
}