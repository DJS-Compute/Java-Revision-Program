import java.util.Scanner;

interface Student {
    void read();
}

class Test implements Student {
    private String rollno;
    private float sem1_marks;
    private float sem2_marks;

    public Test(String rollno, float sem1_marks, float sem2_marks) {
        this.rollno = rollno;
        this.sem1_marks = sem1_marks;
        this.sem2_marks = sem2_marks;
    }

    public void read() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student details:");
        System.out.print("Roll No: ");
        rollno = scanner.nextLine();
        System.out.println("Enter test marks:");
        System.out.print("Semester 1 Marks: ");
        sem1_marks = Float.parseFloat(scanner.nextLine());
        System.out.print("Semester 2 Marks: ");
        sem2_marks = Float.parseFloat(scanner.nextLine());
    }
}

interface Sports {
    int score();
}

class Result extends Test implements Sports {
    private int score_value;

    public Result(String rollno, float sem1_marks, float sem2_marks, int score) {
        super(rollno, sem1_marks, sem2_marks);
        this.score_value = score;
    }

    public int score() {
        return score_value;
    }

    public float calculate_total() {
        return sem1_marks + sem2_marks + score();
    }

    public static void main(String[] args) {
        Result result = new Result("S001", 80, 85, 10);
        result.read();
        System.out.println("Total marks: " + result.calculate_total());
    }
}
