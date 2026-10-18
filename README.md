# Huffman Coding Compressor

## 📌 Project Overview

The Huffman Coding Compressor is a Java-based project that demonstrates lossless data compression using the Huffman Coding algorithm.

Huffman Coding is a compression technique that assigns shorter binary codes to frequently occurring characters and longer binary codes to less frequent characters. This helps reduce the number of bits required to represent text data while preserving the original information.

This project implements the major stages of Huffman Coding, including character frequency counting, Min Heap construction, Huffman tree construction, code generation, encoding, and decoding.

## 🎯 Objectives

- Understand the working principle of the Huffman Coding algorithm.
- Implement character frequency counting using Java collections.
- Construct a Min Heap based on character frequencies.
- Build a Huffman tree for generating binary codes.
- Encode text into a binary string.
- Decode the encoded string to recover the original text.
- Demonstrate lossless compression using modular Java programming.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Data Structures:** HashMap, Min Heap, Binary Tree, Priority Queue
- **Java Collections:** Map, HashMap, PriorityQueue, ArrayList
- **Development Environment:** Visual Studio Code
- **Version Control:** Git and GitHub

## 📂 Project Structure

```text
Huffman-Coding-Project/
│
├── FrequencyCounter.java
├── MinHeap.java
├── HuffmanTree.java
├── CodeGenerator.java
├── Encoder.java
├── Decoder.java
├── Main.java
└── README.md
```

## ⚙️ Modules

### Module 1: Character Frequency Counter

- Reads the input text provided by the user.
- Counts the frequency of each character.
- Stores character-frequency pairs using a HashMap.

### Module 2: Min Heap Construction

- Implements a Min Heap to organize characters according to their frequencies.
- Supports insertion and maintains the Min Heap property.
- Provides operations to inspect and display heap contents.

### Module 3: Huffman Tree Construction

- Creates leaf nodes for individual characters.
- Repeatedly combines the two lowest-frequency nodes.
- Constructs the Huffman tree used for code generation.

### Module 4: Huffman Code Generation

- Traverses the Huffman tree recursively.
- Assigns `0` to left edges and `1` to right edges.
- Generates a unique prefix-free binary code for each character.

### Module 5: Text Encoding

- Replaces each input character with its corresponding Huffman code.
- Produces the encoded binary string.
- Calculates the number of bits in the encoded string.

### Module 6: Text Decoding

- Reads the encoded binary string.
- Traverses the Huffman tree according to each bit.
- Reconstructs the original text from the encoded data.

### Main Module: Integration

- Connects the individual modules.
- Accepts input from the user.
- Displays character frequencies, heap contents, Huffman codes, encoded data, and decoded text.
- Verifies whether the decoded text matches the original input.

## ▶️ How to Run the Project

### Prerequisites

- Install the Java Development Kit (JDK).
- Install Visual Studio Code or use another Java-compatible development environment.
- Ensure that all `.java` files are saved in the same project folder.

### Step 1: Open the Project Folder

Open the `Huffman-Coding-Project` folder in Visual Studio Code.

### Step 2: Open the Terminal

Open the integrated terminal in VS Code and navigate to the project folder.

### Step 3: Compile the Java Files

Run the following command:

```bash
javac FrequencyCounter.java MinHeap.java HuffmanTree.java CodeGenerator.java Encoder.java Decoder.java Main.java
```

### Step 4: Execute the Program

Run:

```bash
java Main
```

### Step 5: Enter the Input

Enter any non-empty text when prompted. The program will display the character frequencies, Huffman codes, encoded binary string, and decoded text.

## 🧪 Sample Demonstration

**Input:**

```text
AABBC
```

**Character Frequencies:**

```text
A = 2
B = 2
C = 1
```

One possible Huffman code assignment is:

```text
C = 0
A = 10
B = 11
```

The corresponding encoded string is:

```text
101011110
```

The decoded output is:

```text
AABBC
```

The exact Huffman codes and encoded bits may vary depending on how ties between equal frequencies are resolved. The decoded output should always match the original input.

## ✅ Expected Result

The program should successfully:

1. Count the frequency of every character.
2. Construct the data structures and Huffman tree.
3. Generate Huffman codes.
4. Encode the original text into a binary string.
5. Decode the binary string.
6. Confirm that the decoded text matches the original text.

## 💡 Applications of Huffman Coding

- Lossless data compression.
- File compression systems.
- Data transmission and storage optimization.
- Entropy coding in compression algorithms.
- Learning fundamental concepts of trees, heaps, and greedy algorithms.

## 🚀 Future Enhancements

- Support reading input directly from text files.
- Save compressed output to a file.
- Store the Huffman tree or code table for later decompression.
- Implement bit-level compression instead of storing encoded bits as text characters.
- Calculate compression ratio and compare original and compressed file sizes.
- Improve integration by using the custom Min Heap directly in Huffman tree construction.
- Add a graphical user interface.

## 📚 Learning Outcomes

Through this project, we explore:

- Java object-oriented programming.
- HashMap and PriorityQueue usage.
- Min Heap operations.
- Binary tree construction and traversal.
- Greedy algorithm design.
- Recursive methods.
- String encoding and decoding.
- Modular software development and GitHub version control.

## 👩‍💻 Author

**Lakshmi Tejaswini**

Second-Year Computer Science and Engineering Student

## 📄 License

This project is available for educational and learning purposes.
