import java.util.Scanner;

public class oj7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 讀取一個字串（整行）
        String input = sc.nextLine();
        sc.close();

        // 取字串第一個字元
        char ch = input.charAt(0);

        // 輸出該字元的 ASCII 整數值
        int ascii = (int) ch;
        System.out.println(ascii);
    }
}
