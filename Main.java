
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Read input text
        System.out.println("===== Huffman Compressor =====");
        System.out.print("Enter the text to compress: ");

        String text = scanner.nextLine();

        if (text.isEmpty()) {
            System.out.println("Input text cannot be empty.");
            scanner.close();
            return;
        }

        // Module 1: Count character frequencies
        Map<Character, Integer> frequencies = FrequencyCounter.countFrequencies(text);

        // Display character frequencies
        System.out.println("\nCharacter Frequencies:");

        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {

            System.out.println(
                    "'" + entry.getKey() + "' : "
                            + entry.getValue());
        }

        scanner.close();
    }
}
