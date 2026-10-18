
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Sample character frequencies for Module 3
        Map<Character, Integer> frequencies = new HashMap<>();

        frequencies.put('A', 4);
        frequencies.put('B', 2);
        frequencies.put('C', 1);
        frequencies.put('D', 3);

        // Module 3: Construct the Huffman tree
        HuffmanTree.TreeNode root =
                HuffmanTree.buildTree(frequencies);

        // Check whether the tree was created
        if (root == null) {
            System.out.println("Huffman tree could not be created.");
            return;
        }

        System.out.println("Huffman Tree Created Successfully!");
        System.out.println("Root Frequency: " + root.frequency);

        // Display the tree structure
        System.out.println("\nHuffman Tree Structure:");
        displayTree(root, "");
    }

    // Display each node recursively
    public static void displayTree(
            HuffmanTree.TreeNode node, String indent) {

        if (node == null) {
            return;
        }

        if (node.isLeaf()) {
            System.out.println(
                indent + "Character: '" + node.character
                + "', Frequency: " + node.frequency
            );
        } else {
            System.out.println(
                indent + "Internal Node, Frequency: "
                + node.frequency
            );
        }

        displayTree(node.left, indent + "  ");
        displayTree(node.right, indent + "  ");
    }
}

