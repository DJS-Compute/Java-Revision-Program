import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            // Default exceptions
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);  // Throws ArrayIndexOutOfBoundsException

            // NumberFormatException
            String numberStr = "abc";
            int number = Integer.parseInt(numberStr);  // Throws NumberFormatException

            // ArithmeticException
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator;  // Throws ArithmeticException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds!");
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format!");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred!");
        }
    }
}
