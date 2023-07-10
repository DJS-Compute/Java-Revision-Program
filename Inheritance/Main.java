class Staff {
    protected String code;
    protected String name;

    public Staff(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public void read() {
        // Not specified in the class diagram
    }

    public void display() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
    }
}

class Teacher extends Staff {
    private String subject;
    private int experience;

    public Teacher(String code, String name, String subject, int experience) {
        super(code, name);
        this.subject = subject;
        this.experience = experience;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Subject: " + subject);
        System.out.println("Experience: " + experience);
    }
}

class Typist extends Staff {
    protected int speed;
    protected int experience;

    public Typist(String code, String name, int speed, int experience) {
        super(code, name);
        this.speed = speed;
        this.experience = experience;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Speed: " + speed);
        System.out.println("Experience: " + experience);
    }
}

class Officer extends Staff {
    private String department;
    private String grade;

    public Officer(String code, String name, String department, String grade) {
        super(code, name);
        this.department = department;
        this.grade = grade;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + department);
        System.out.println("Grade: " + grade);
    }
}

class Regular extends Typist {
    private double salary;

    public Regular(String code, String name, int speed, int experience, double salary) {
        super(code, name, speed, experience);
        this.salary = salary;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + salary);
    }
}

class Casual extends Typist {
    private double dailyWages;

    public Casual(String code, String name, int speed, int experience, double dailyWages) {
        super(code, name, speed, experience);
        this.dailyWages = dailyWages;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Daily Wages: " + dailyWages);
    }
}

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("T001", "John Doe", "Mathematics", 5);
        Regular regularStaff = new Regular("R001", "Jane Smith", 80, 3, 5000);
        Typist typist = new Typist("TYP001", "Alice Johnson", 80, 3);
        Casual casualStaff = new Casual("C001", "Bob Wilson", 80, 3, 100);
        Officer officer = new Officer("O001", "Emily Brown", "Administration", "A");

        teacher.display();
        System.out.println();
        regularStaff.display();
        System.out.println();
        typist.display();
        System.out.println();
        casualStaff.display();
        System.out.println();
        officer.display();
    }
}

