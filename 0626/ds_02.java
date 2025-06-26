import java.util.Scanner;

public class ds_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("圓的半徑：");
        double radius = sc.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("圓的面積：" + area);
    }
}