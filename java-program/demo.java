import java.util.InputMismatchException;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        try {
            System.out.println("Enter a number to divide: ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            System.out.println(4 / a);
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input. Please enter an integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred.");
        }
    }
}































