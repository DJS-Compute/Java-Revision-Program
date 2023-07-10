public class RecursivePower {
    public static void main(String[] args) {
        int x = 2; // Base
        int n = 3; // Exponent

        int result = power(x, n);
        System.out.println(x + " raised to the power " + n + " = " + result);
    }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }
}
