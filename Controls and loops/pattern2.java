 public class Main {
    public static void main(String[] args) {
        int num = 4;
        int count = num - 1;
        int temp = 65;
        int alpha, temp1 = 1;

        for (int i = 1; i <= num; i++) {
            for (int k = 1; k <= count; k++) {
                System.out.print(" ");
            }

            alpha = temp;
            for (int j = 1; j <= i; j++) {
                System.out.print((char) alpha);
                alpha--;
            }

            temp = temp + (++temp1);
            System.out.println();
            count--;
        }
    }
}




