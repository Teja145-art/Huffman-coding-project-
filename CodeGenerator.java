import java.util.HashMap;
import java.util.Map;

public class CodeGenerator {

    // Module 4: Generate Huffman codes
    public static Map<Character, String> generateCodes(
            HuffmanTree.TreeNode root) {

        Map<Character, String> codes = new HashMap<>();

        if (root == null) {
            return codes;
        }

        // Special case: input contains only one unique character
        if (root.isLeaf()) {
            codes.put(root.character, "0");
            return codes;
        }

        generateCodesRecursive(root, "", codes);

        return codes;
    }

    // Recursively generate codes by traversing the tree
    private static void generateCodesRecursive(
            HuffmanTree.TreeNode node,
            String code,
            Map<Character, String> codes) {

        if (node == null) {
            return;
        }

        // If it is a leaf node, store its Huffman code
        if (node.isLeaf()) {
            codes.put(node.character, code);
            return;
        }

        // Left edge represents 0
        generateCodesRecursive(
                node.left,
                code + "0",
                codes);

        // Right edge represents 1
        generateCodesRecursive(
                node.right,
                code + "1",
                codes);
    }

    // Display the generated Huffman codes
    public static void displayCodes(
            Map<Character, String> codes) {

        System.out.println("Huffman Codes:");

        for (Map.Entry<Character, String> entry : codes.entrySet()) {

            System.out.println(
                    "'" + entry.getKey()
                            + "' : " + entry.getValue());
        }
    }
}