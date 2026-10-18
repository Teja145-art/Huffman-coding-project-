
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MinHeap {

    // Represents a node containing a character and its frequency
    public static class HeapNode {
        public char character;
        public int frequency;

        public HeapNode(char character, int frequency) {
            this.character = character;
            this.frequency = frequency;
        }
    }

    // Stores nodes in the minimum heap
    private final List<HeapNode> heap = new ArrayList<>();

    // Swap two nodes in the heap
    private void swap(int i, int j) {
        HeapNode temp = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, temp);
    }

    // Maintain the min-heap property after insertion
    private void heapifyUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;

            if (heap.get(parent).frequency
                    <= heap.get(index).frequency) {
                break;
            }

            swap(parent, index);
            index = parent;
        }
    }

    // Insert a character and its frequency
    public void insert(char character, int frequency) {
        heap.add(new HeapNode(character, frequency));
        heapifyUp(heap.size() - 1);
    }

    // Construct the min heap using Module 1 frequency data
    public void buildMinHeap(
            Map<Character, Integer> frequencies) {

        heap.clear();

        for (Map.Entry<Character, Integer> entry
                : frequencies.entrySet()) {

            insert(entry.getKey(), entry.getValue());
        }
    }

    // Return the node with the smallest frequency
    public HeapNode peekMin() {
        if (heap.isEmpty()) {
            return null;
        }

        return heap.get(0);
    }

    // Return the number of nodes in the heap
    public int size() {
        return heap.size();
    }

    // Check whether the heap is empty
    public boolean isEmpty() {
        return heap.isEmpty();
    }

    // Display heap contents
    public void displayHeap() {
        System.out.println("Minimum Heap:");

        for (HeapNode node : heap) {
            System.out.println(
                "'" + node.character + "' : "
                + node.frequency
            );
        }
    }
}

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Sample frequency data for Module 2
        Map<Character, Integer> frequencies = new HashMap<>();

        frequencies.put('A', 2);
        frequencies.put('B', 2);
        frequencies.put('C', 1);
        frequencies.put('D', 4);

        // Create the minimum heap
        MinHeap minHeap = new MinHeap();

        // Build the heap
        minHeap.buildMinHeap(frequencies);

        // Display the heap
        minHeap.displayHeap();

        // Display the minimum node
        MinHeap.HeapNode minimum = minHeap.peekMin();

        if (minimum != null) {
            System.out.println(j
                    "\nMinimum node: " + minimum.character
                            + ", Frequency: " + minimum.frequency);
        }
    }
}
