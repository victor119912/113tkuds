class BasicArrayOperations {
    public static void main(String[] args) {
        int[] scores = {15, 28, 7, 42, 91, 33, 66, 58,24, 81};
        
        System.out.println("陣列長度為: " + scores.length);

        scores[2] = 99;

        scores[scores.length - 1] = 100;

         for (int i = 0; i < scores.length; i++) {
            System.out.println(i + ": " + scores[i]);
        }
    }
}