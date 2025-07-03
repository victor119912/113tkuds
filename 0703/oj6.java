import java.util.Scanner;

public class oj6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int intNum = sc.nextInt();
        double doubleNum = sc.nextDouble();
        sc.close();

        double sum = intNum + doubleNum;

        System.out.printf("%.2f\n", sum);
    }
}

