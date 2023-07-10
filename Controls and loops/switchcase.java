import java.util.*;
class HelloWorld{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1.Addition 2.Subtraction 3.Multiplication 4.Division : ");
        int choice = sc.nextInt();
        System.out.println("Enter a first number : ");
        int a = sc.nextInt();
        System.out.println("Enter a second number : ");
        int b = sc.nextInt();
        switch(choice){
            case 1 :
                float c = a + b;
                System.out.println("Addition : "+c);
                break;
            case 2 :
                c = a - b;
                System.out.println("Subtraction : "+c);
                break;
            case 3 :
                c = a * b;
                System.out.println("Multiplication : "+c);
                break;
            case 4 :
                c = (float) a / b;
                System.out.println("Division : "+c);
                break;
            default :
                System.out.println("Invalid input"); 
        }
    }
}






