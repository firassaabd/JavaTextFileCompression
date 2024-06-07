import java.util.*;
import java.text.DecimalFormat;


class Node implements Comparable<Node> {
    char ch;
    int freq;
    Node left, right;

    public Node(char ch, int freq, Node left, Node right) {
        this.ch = ch;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }

    @Override
    public int compareTo(Node other) {
        return this.freq - other.freq;
    }
}

public class Huffman {
    public static void main(String[] args) {
        String text = "Bonjour, le monde est beau !";
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            pq.add(new Node(entry.getKey(), entry.getValue(), null, null));
        }
        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node parent = new Node('\0', left.freq + right.freq, left, right);
            pq.add(parent);
        }
        Node root = pq.peek();
        Map<Character, String> huffmanCodes = new HashMap<>();
        generateCodes(root, "", huffmanCodes);
        System.out.println("Huffman Codes: " + huffmanCodes);

        // Encode the text using Huffman codes
        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encodedText.append(huffmanCodes.get(c));
        }
        System.out.println("Encoded Text: " + encodedText);

        // Calculate binary length of encoded text
        int binaryLength = encodedText.length();
        System.out.println("Binary Length: " + binaryLength + " bits");

        // Calculate compression ratio
        double compressionRatio = (double) (text.length() * 8 / binaryLength)*100;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Compression Ratio: " + df.format(compressionRatio) + "%");

        // Calculate average bits per character
        double bitsPerCharacter = (double) binaryLength / text.length();
        System.out.println("Average Bits per Character: " + df.format(bitsPerCharacter));
    }

    private static void generateCodes(Node node, String code, Map<Character, String> huffmanCodes) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            huffmanCodes.put(node.ch, code);
            return;
        }
        generateCodes(node.left, code + "0", huffmanCodes);
        generateCodes(node.right, code + "1", huffmanCodes);
    }
}
