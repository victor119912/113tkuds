import java.util.Scanner;

public class oj5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int celsius = sc.nextInt();
        sc.close();

        int fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(fahrenheit);
    }
}
