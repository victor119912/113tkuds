import java.util.Scanner;

public class oj24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int result = 1;
        int i = 1;

        while (i <= N) {
            result *= i;
            i++;
        }

        System.out.println(result);
    }
}
