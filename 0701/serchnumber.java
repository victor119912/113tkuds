import java.util.Scanner;

public class serchnumber {
    public static void main(String[] args) {
        int [] s = {1, 3, 5, 7, 9, 11, 13}; // 已排序的數列
        Scanner scanner = new Scanner(System.in);

        System.out.print("請輸入要查找的數字:");
        int x = scanner.nextInt();
        boolean found = false;

        //線性指導
        for (int num : s) {
            if (num == x) {
                found = true;
                break;
            }
        }

        // 在這裡使用found變數
        if (found) {
            System.out.println("有找到這個數字");
        } else {
            System.out.println("找不到這個數字");
        }
    }
}