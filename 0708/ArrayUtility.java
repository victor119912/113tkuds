public class ArrayUtility {

    
    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    
    public static int[] copyArray(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            copy[i] = array[i];
        }
        return copy;
    }

    
    public static int findSecondLargest(int[] array) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        
        int[] numbers = {3, 7, 1, 9, 4, 6, 8, 2, 5};

        System.out.print("原始陣列：");
        printArray(numbers);

        
        reverseArray(numbers);
        System.out.print("反轉後陣列：");
        printArray(numbers);

        
        int[] copied = copyArray(numbers);
        System.out.print("複製的陣列：");
        printArray(copied);

    
        int secondLargest = findSecondLargest(numbers);
        System.out.println("陣列中的第二大數值：" + secondLargest);
    }
}
