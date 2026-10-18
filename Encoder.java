import java.util.Map;

public class Encoder {

    // Module 5: Encode the input text using Huffman codes
    public static String encode(
            String text,
            Map<Character, String> codes) {

        StringBuilder encodedText = new StringBuilder();

        // Convert each character into its Huffman code
        for (int i = 0; i < text.length(); i++) {

            char ch = text.charAt(i);

            String code = codes.get(ch);

            if (code == null) {
                throw new IllegalArgumentException(
                        "No Huffman code found for character: " + ch);
            }

            encodedText.append(code);
        }

        return encodedText.toString();
    }

    // Display the encoded data
    public static void displayEncodedText(String encodedText) {

        System.out.println("Encoded Text:");
        System.out.println(encodedText);
    }

    // Return the number of bits in the encoded data
    public static int getEncodedLength(String encodedText) {

        return encodedText.length();
    }
}