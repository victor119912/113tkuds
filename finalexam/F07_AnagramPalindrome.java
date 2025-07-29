import java.util.*;

public class F07_AnagramPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        int[] freq = new int[26];
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                freq[c - 'a']++;
            }
        }

        int oddCount = 0;
        for (int f : freq) {
            if (f % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount <= 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
