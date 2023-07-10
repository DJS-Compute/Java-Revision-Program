import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = sc.nextInt();
        int flag = 0;
        for(int i = 1;i <= n;i++){
           if (flag == 0){
               for (int j = 1; j <= i; j++){
                   System.out.print(j + " ");
               }
                flag = 1;
           }
           else{
               for (int j = i; j >= 1; j--){
                   System.out.print(j + " ");
               }
               flag = 0;
           }
          System.out.println();
        }
    }



