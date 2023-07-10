import java.util.Arrays;
import java.util.Comparator;

class Student {
    String name;
    int id;
    int mathsMarks;
    int physicsMarks;
    int chemistryMarks;

    public Student(String name, int id, int mathsMarks, int physicsMarks, int chemistryMarks) {
        this.name = name;
        this.id = id;
        this.mathsMarks = mathsMarks;
        this.physicsMarks = physicsMarks;
        this.chemistryMarks = chemistryMarks;
    }

    public int getTotalMarks() {
        return mathsMarks + physicsMarks + chemistryMarks;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println();
    }
}

public class StudentMarksSorting {
    public static void main(String[] args) {
        Student[] students = {
                new Student("John", 1, 80, 90, 85),
                new Student("Alice", 2, 95, 88, 92),
                new Student("Bob", 3, 75, 82, 78)
        };

        Arrays.sort(students, Comparator.comparingInt(Student::getTotalMarks).reversed());

        System.out.println("Students sorted in descending order of total marks:");
        for (Student student : students) {
            student.display();
        }
    }
}
