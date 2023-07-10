public class ArraySumExceptIndex {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int[] result = calculateSumExceptIndex(array);
        printArray(result);
    }

    public static int[] calculateSumExceptIndex(int[] array) {
        int[] result = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array.length; j++) {
                if (i != j) {
                    sum += array[j];
                }
            }
            result[i] = sum;
        }

        return result;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}

