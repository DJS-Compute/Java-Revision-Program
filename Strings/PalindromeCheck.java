public class PalindromeCheck {
    public static void main(String[] args) {
        String inputString = "madam";
        String reversedString = new StringBuilder(inputString).reverse().toString();

        if (inputString.equalsIgnoreCase(reversedString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}

