import java.util.*;

public class F03_ConvenienceHotItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        
        String[] names = new String[n];
        int[] qtys = new int[n];
        
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            names[i] = parts[0];
            qtys[i] = Integer.parseInt(parts[1]);
        }

        // 插入排序：由大到小排序 qty，同時對應調整 name
        for (int i = 1; i < n; i++) {
            int keyQty = qtys[i];
            String keyName = names[i];
            int j = i - 1;
            while (j >= 0 && qtys[j] < keyQty) {
                qtys[j + 1] = qtys[j];
                names[j + 1] = names[j];
                j--;
            }
            qtys[j + 1] = keyQty;
            names[j + 1] = keyName;
        }

        int limit = Math.min(10, n);
        for (int i = 0; i < limit; i++) {
            System.out.println(names[i] + " " + qtys[i]);
        }
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：用的是插入排序，在最壞的情況下（例如每筆都要插到最前面）會需要 n² 次比較與移動。
 */
