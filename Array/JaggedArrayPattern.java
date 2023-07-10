import java.util.Scanner;

public class JaggedArrayPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();

        int[][] jaggedArray = new int[numRows][];

        for (int i = 0; i < numRows; i++) {
            jaggedArray[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                jaggedArray[i][j] = j + 1;
            }
        }

       for (int[] row : jaggedArray) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

