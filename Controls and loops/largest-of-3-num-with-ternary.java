import java.util.*;
class HelloWorld{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter a 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter a 3rd number: ");
        int c = sc.nextInt();
        int ans = (a > b) ? ((a > c) ? a : c ) : ((b > c) ? b : c );
        System.out.println("Greastest of all : "+ans);
    }
}

