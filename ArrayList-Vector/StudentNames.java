import java.util.Scanner;
import java.util.Vector;

public class StudentNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<String> studentNames = new Vector<>();

        System.out.println("Enter student names (enter 'done' to finish):");

        while (true) {
            String name = scanner.nextLine();

            if (name.equals("done")) {
                break;
            }
            studentNames.add(name);
        }
        System.out.println("Student names stored in vector: " + studentNames);
        scanner.close();
    }
}
