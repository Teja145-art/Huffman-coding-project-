import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Sample character frequencies
        Map<Character, Integer> frequencies = new HashMap<>();

        frequencies.put('A', 4);
        frequencies.put('B', 2);
        frequencies.put('C', 1);
        frequencies.put('D', 3);

        // Module 3: Build the Huffman tree
        HuffmanTree.TreeNode root =
                HuffmanTree.buildTree(frequencies);

        // Check whether the tree was created
        if (root == null) {
            System.out.println("Huffman tree could not be created.");
            return;
        }

        // Module 4: Generate Huffman codes
        Map<Character, String> codes =
                CodeGenerator.generateCodes(root);

        // Display the generated codes
        CodeGenerator.displayCodes(codes);
    }
}