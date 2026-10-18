
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HuffmanCompressor {

    // Module 1: Read input text
    public static String readInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Huffman Compressor =====");
        System.out.print("Enter the text to compress: ");

        String text = scanner.nextLine();

        return text;
    }

    // Module 1: Count character frequencies
    public static Map<Character, Integer> countFrequencies(String text) {
        Map<Character, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            frequencies.put(
                ch,
                frequencies.getOrDefault(ch, 0) + 1
            );
        }

        return frequencies;
    }

    // Main method to test Module 1
    public static void main(String[] args) {
        String text = readInput();

        if (text.isEmpty()) {
            System.out.println("Input text cannot be empty.");
            return;
        }

        Map<Character, Integer> frequencies =
                countFrequencies(text);

        System.out.println("\nCharacter Frequencies:");

        for (Map.Entry<Character, Integer> entry
                : frequencies.entrySet()) {
            System.out.println(
                "'" + entry.getKey() + "' : "
                + entry.getValue()
            );
        }
    }
}
