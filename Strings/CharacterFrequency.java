public class CharacterFrequency {
    public static void main(String[] args) {
        String line = "This is a sample line of text.";
        char targetChar = 'i';
        int frequency = 0;

        for (char ch : line.toCharArray()) {
            if (ch == targetChar) {
                frequency++;
            }
        }

        System.out.println("Frequency of '" + targetChar + "': " + frequency);
    }
}

