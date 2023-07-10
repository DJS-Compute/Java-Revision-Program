import java.util.Scanner;

class MarksOutOfBoundsException extends Exception {
    public MarksOutOfBoundsException(String message) {
        super(message);
    }
}

public class UserDefinedExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();

            if (marks < 0 || marks > 100) {
                throw new MarksOutOfBoundsException("Marks are out of bounds!");
            }

            System.out.println("Marks: " + marks);
        } catch (MarksOutOfBoundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
