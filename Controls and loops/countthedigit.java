import java.util.*;
class HelloWorld{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number less than ten billion: ");
        long a = sc.nextLong();
        System.out.println("Number: "+a);
        int count = 0;
        while (a != 0){
            count = count + 1;
            a = a/10;
        }
        System.out.println("Number of digits : "+count);
    }
}




