class loopb {
    public static void main(String[] args) {
        int x = 0;
        int i = 1;
        int count = 0;
        while (++i <= 100)                 // ++i 先把i變成2,在檢查
        {
            x = x + 1;
            count++;
        }
        System.out.println("count");       // 99
    }
}
    