import java.util.*;

public class F05_LCMRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int gcd = getGCD(a, b);
        int lcm = a * b / gcd;
        System.out.println("LCM: " + lcm);
    }

    public static int getGCD(int a, int b) {
        if (a == b) return a;
        if (a > b) return getGCD(a - b, b);
        else return getGCD(a, b - a);
    }
}

/*
 * Time Complexity: O(max(a, b))
 * 說明：用輾轉相減法遞迴求 GCD，最壞情況下每次只減一小步，最多要跑到 a 或 b 歸零，整體效率跟輸入大小有關。
 */

