import java.util.*;
class HelloWorld{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int a = sc.nextInt();
        System.out.println("Number Entered : "+a);
        if (a % 2 == 0){
           if (a >= 2 && a <= 5){
              System.out.println("\n"+"Not Weird"); 
           }else{
               if (a >= 6 && a <=20){
                 System.out.println("\n"+"Weird");  
               }else{
                   System.out.println("\n"+"Not Weird"); 
               }
           }
        }else{
           System.out.println("\n"+"Weird"); 
        }
    }
}
