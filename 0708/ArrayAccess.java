 class ArrayAccess {
    public static void main(String[] args) {
        int[] scores = {85, 92, 77, 60, 88};  // 宣告並初始化陣列

        // 取得第一個元素
        int firstScore = scores[0];
        // 取得最後一個元素
        int lastScore = scores[4];
        // 取得中間的元素 (假設取第三個)
        int middleScore = scores[2];

        System.out.println("第一個成績：" + firstScore);
        System.out.println("最後一個成績：" + lastScore);
        System.out.println("中間成績：" + middleScore);

        // 修改操作
        scores[0] = 90;  // 將第一個成績改為 90
        scores[scores.length - 1] = 95;  // 將最後一個成績改為 95

        // 陣列長度
        int arrayLength = scores.length;
        System.out.println("\n修改後的陣列：");
        for (int i = 0; i < arrayLength; i++) {
            System.out.printf("第 %d 個成績: %d\n", i + 1, scores[i]);
        }
    }
}
