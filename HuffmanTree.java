
import java.util.Map;
import java.util.PriorityQueue;

public class HuffmanTree {

    // Represents a node in the Huffman tree
    public static class TreeNode {
        public char character;
        public int frequency;

        public TreeNode left;
        public TreeNode right;

        // Leaf node constructor
        public TreeNode(char character, int frequency) {
            this.character = character;
            this.frequency = frequency;
            this.left = null;
            this.right = null;
        }

        // Internal node constructor
        public TreeNode(int frequency, TreeNode left, TreeNode right) {
            this.character = '\0';
            this.frequency = frequency;
            this.left = left;
            this.right = right;
        }

        // Check whether the node is a leaf
        public boolean isLeaf() {
            return left == null && right == null;
        }
    }

    // Module 3: Construct the Huffman tree
    public static TreeNode buildTree(
            Map<Character, Integer> frequencies) {

        if (frequencies == null || frequencies.isEmpty()) {
            return null;
        }

        // Priority queue keeps the lowest-frequency node first
        PriorityQueue<TreeNode> queue = new PriorityQueue<>(
                (a, b) -> Integer.compare(
                        a.frequency, b.frequency));

        // Create one leaf node for each character
        for (Map.Entry<Character, Integer> entry : frequencies.entrySet()) {

            queue.offer(
                    new TreeNode(
                            entry.getKey(),
                            entry.getValue()));
        }

        // Repeatedly combine the two smallest nodes
        while (queue.size() > 1) {

            TreeNode left = queue.poll();
            TreeNode right = queue.poll();

            // Create a parent node with combined frequency
            TreeNode parent = new TreeNode(
                    left.frequency + right.frequency,
                    left,
                    right);

            // Insert the parent back into the queue
            queue.offer(parent);
        }

        // The final node is the root of the Huffman tree
        return queue.poll();
    }
}
