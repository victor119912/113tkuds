import java.util.Scanner;

public class ds_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("姓名：");
        String name = sc.nextLine();
        System.out.print("年齡：");
        int age = sc.nextInt();
        sc.nextLine(); // 吃掉換行
        System.out.print("城市：");
        String city = sc.nextLine();

        System.out.println("個人資訊：");
        System.out.println("姓名：" + name);
        System.out.println("年齡：" + age);
        System.out.println("城市：" + city);
    }
}