public class ds_05 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 13, 21, 34, 55, 89, 144, 233};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("陣列總和為：" + sum);
    }
}