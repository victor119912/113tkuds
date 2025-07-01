public class matrix_mul {
    public static void main(String[] args) {
        // 定義第一個 3x3 矩陣 a
        int[][] a = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 定義第二個 3x3 矩陣 b
        int[][] b = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // 宣告結果矩陣 c（3x3）
        int[][] c = new int[3][3];

        // 矩陣相乘
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // 輸出結果矩陣
        System.out.println("矩陣相乘結果：");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
