import java.util.Scanner;

public class Q10_ArrayToStringUtil {

    public static String arrayToString(int[] arr) {
        if (arr == null) {
            return "null";
        }
        if (arr.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length -1) {
                sb.append(", ");
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] data = new int[n];

        for (int i = 0; i < n; i++) {
            data[i] = input.nextInt();
        }

        System.out.println(arrayToString(data));

        input.close();
    }
}
