
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Read the input text
        System.out.println("==================================");
        System.out.println("   HUFFMAN CODING COMPRESSOR");
        System.out.println("==================================");

        System.out.print("Enter text to compress: ");
        String text = scanner.nextLine();

        if (text.isEmpty()) {
            System.out.println("Error: Input text cannot be empty.");
            scanner.close();
            return;
        }

        // Module 1: Count character frequencies
        Map<Character, Integer> frequencies = FrequencyCounter.countFrequencies(text);

        System.out.println("\n1. Character Frequencies");
        System.out.println(frequencies);

        // Module 2: Build and display the Min Heap
        MinHeap minHeap = new MinHeap();
        minHeap.buildMinHeap(frequencies);

        System.out.println("\n2. Min Heap");
        minHeap.displayHeap();

        // Module 3: Construct the Huffman Tree
        HuffmanTree.TreeNode root = HuffmanTree.buildTree(frequencies);

        System.out.println("\n3. Huffman Tree");
        System.out.println(
                "Tree constructed successfully.");
        System.out.println(
                "Root frequency: " + root.frequency);

        // Module 4: Generate Huffman Codes
        Map<Character, String> codes = CodeGenerator.generateCodes(root);

        System.out.println("\n4. Huffman Codes");
        CodeGenerator.displayCodes(codes);

        // Module 5: Encode the input text
        String encodedText = Encoder.encode(text, codes);

        System.out.println("\n5. Encoded Text");
        Encoder.displayEncodedText(encodedText);

        System.out.println(
                "Encoded length: "
                        + Encoder.getEncodedLength(encodedText)
                        + " bits");

        // Module 6: Decode the encoded text
        String decodedText = Decoder.decode(encodedText, root);

        System.out.println("\n6. Decoded Text");
        Decoder.displayDecodedText(decodedText);

        // Verify the complete process
        System.out.println("\n==================================");

        if (text.equals(decodedText)) {
            System.out.println(
                    "SUCCESS: Compression and decompression worked!");
        } else {
            System.out.println(
                    "ERROR: Decoded text does not match.");
        }

        System.out.println("==================================");

        scanner.close();
    }
}
