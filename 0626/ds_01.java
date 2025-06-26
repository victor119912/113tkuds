import java.util.Scanner;

public class ds_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("第一個整數：");
        int a = sc.nextInt();
        System.out.print("第二個整數：");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("和：" + sum);
    }
}