import java.util.Scanner;
import java.util.Vector;

public class StringVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> stringVector = new Vector<>();

        System.out.print("Enter the number of strings to add: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Add n strings to the vector
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();
            stringVector.add(inputString);
        }

        System.out.println("Vector: " + stringVector);

        System.out.print("Enter a new string to check: ");
        String newString = scanner.nextLine();

        if (stringVector.contains(newString)) {
            stringVector.remove(newString);
            System.out.println("String found in the vector and removed.");
        } else {
            stringVector.add(newString);
            System.out.println("String not found in the vector and added.");
        }

        System.out.println("Updated vector: " + stringVector);
        scanner.close();
    }
}
