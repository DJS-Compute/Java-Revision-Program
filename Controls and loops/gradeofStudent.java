import java.util.*;
	import java.util.*;
class HelloWorld{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        char grade;
        System.out.println("Enter your marks : ");
        int marks = sc.nextInt();
        if (marks > 100 || marks < 0) {
            grade = 'I'; 
        } else if (marks > 90) {
            grade = 'A';
        } else if (marks > 75) {
            grade = 'B';
        } else if (marks > 55) {
            grade = 'C';
        } else if (marks >= 35) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        switch (grade) {
            case 'A':
                System.out.println("A+");
                break;
            case 'B':
                System.out.println("A");
                break;
            case 'C':
                System.out.println("B");
                break;
            case 'D':
                System.out.println("C");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}





