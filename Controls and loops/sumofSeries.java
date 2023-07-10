import java.util.*;
class HelloWorld {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
        double sum = 0.0,res = 1;
        System.out.println("Entered number : "+n);
        for(int i = 0;i<n;i++){
            res = 1/(Math.pow(i,i));
            sum +=res;
        }
        System.out.println(" Sum of Series : "+sum); 
    }
}




