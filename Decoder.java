
public class Decoder {

    // Module 6: Decode the binary string using the Huffman tree
    public static String decode(
            String encodedText,
            HuffmanTree.TreeNode root) {

        // Handle empty input or an empty tree
        if (root == null || encodedText == null) {
            return "";
        }

        if (encodedText.isEmpty()) {
            return "";
        }

        StringBuilder decodedText = new StringBuilder();

        // Special case: the tree contains only one character
        if (root.isLeaf()) {
            for (int i = 0; i < encodedText.length(); i++) {
                char bit = encodedText.charAt(i);

                if (bit != '0') {
                    throw new IllegalArgumentException(
                            "Invalid encoded bit for a single-character tree.");
                }

                decodedText.append(root.character);
            }

            return decodedText.toString();
        }

        HuffmanTree.TreeNode current = root;

        // Traverse the tree according to each encoded bit
        for (int i = 0; i < encodedText.length(); i++) {

            char bit = encodedText.charAt(i);

            if (bit == '0') {
                current = current.left;
            } else if (bit == '1') {
                current = current.right;
            } else {
                throw new IllegalArgumentException(
                        "Encoded text must contain only 0 and 1.");
            }

            // Check whether the path exists
            if (current == null) {
                throw new IllegalArgumentException(
                        "Invalid encoded sequence.");
            }

            // A leaf represents one decoded character
            if (current.isLeaf()) {
                decodedText.append(current.character);

                // Start again from the root for the next character
                current = root;
            }
        }

        // Reject a sequence that ends partway through a code
        if (current != root) {
            throw new IllegalArgumentException(
                    "Incomplete Huffman code at the end of input.");
        }

        return decodedText.toString();
    }

    // Display the decoded text
    public static void displayDecodedText(String decodedText) {
        System.out.println("Decoded Text:");
        System.out.println(decodedText);
    }
}
