// file: countloops.java
public class countloops {
    public static void main(String[] args) {
        int count = 0; // 記錄加法執行次數
        int sum = 0;
        int i;

        for (i = 1; i <= 5; i++) {
            System.out.println("第 " + i + " 次迴圈：sum = " + sum + " + " + i);
            sum += i;
            count++; // 每次加法都記錄一次
        }

        System.out.println("總和為： " + sum);
        System.out.println("加法執行了 " + count + " 次");
    }
}
