import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class HuffmanV2 {
    public static void main(String[] args) {
        String text = "testerhhhdsjndns  dns d,ns dnsbd";

        // Compression Huffman
        ResultatH resultatCompression = compresserHuffman(text);

        // Affichage des résultats de la compression
        afficherResultats(resultatCompression);

        // Demander à l'utilisateur s'il souhaite décompresser
        System.out.print("Voulez-vous décompresser le texte compressé ? (Y/N) : ");
        Scanner scanner = new Scanner(System.in);
        String choix = scanner.nextLine().toUpperCase();

        if (choix.equals("Y")) {
            // Décompression Huffman
            String texteDecomprime = decompresserHuffman(resultatCompression.texteCompresse, resultatCompression.codes);
            // Affichage du résultat de la décompression
            System.out.println("Texte décompressé : " + texteDecomprime);
        }
    }

    public static ResultatH compresserHuffman(String text) {
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

        String texteCompresse = getCodeTexteCompresseH(text, huffmanCodes);

        int longueurOriginale = text.length() * 8;
        int longueurCompressee = texteCompresse.length();
        double tauxCompression = (double) longueurCompressee / longueurOriginale * 100;

        return new ResultatH(texteCompresse, huffmanCodes, longueurOriginale, longueurCompressee, tauxCompression);
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

    public static String decompresserHuffman(String texteCompresse, Map<Character, String> huffmanCodes) {
        StringBuilder texteDecomprime = new StringBuilder();
        StringBuilder codeActuel = new StringBuilder();
        int index = 0;

        while (index < texteCompresse.length()) {
            codeActuel.append(texteCompresse.charAt(index));
            for (Map.Entry<Character, String> entry : huffmanCodes.entrySet()) {
                if (entry.getValue().equals(codeActuel.toString())) {
                    texteDecomprime.append(entry.getKey());
                    codeActuel.setLength(0);
                    break;
                }
            }
            index++;
        }

        return texteDecomprime.toString();
    }

    private static String getCodeTexteCompresseH(String texteOriginal, Map<Character, String> huffmanCodes) {
        StringBuilder texteCompresse = new StringBuilder();
        for (char c : texteOriginal.toCharArray()) {
            texteCompresse.append(huffmanCodes.get(c));
        }
        return texteCompresse.toString();
    }

    private static void afficherResultats(ResultatH resultat) {
        System.out.println("Texte original : " + resultat.texteCompresse);
        System.out.println("Huffman Codes: " + resultat.codes);
        System.out.println("Texte compressé en binaire : " + resultat.texteCompresse);
        System.out.println("Longueur binaire par bit : " + resultat.longueurCompressee);
        System.out.println("Longueur originale (bits) : " + resultat.longueurOriginale);
        System.out.println("Taux de compression : " + new DecimalFormat("#.##").format(resultat.tauxCompression) + "%");
    }

    static class Node implements Comparable<Node> {
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

    static class ResultatH {
        String texteCompresse;
        Map<Character, String> codes;
        int longueurOriginale;
        int longueurCompressee;
        double tauxCompression;

        public ResultatH(String texteCompresse, Map<Character, String> codes, int longueurOriginale, int longueurCompressee, double tauxCompression) {
            this.texteCompresse = texteCompresse;
            this.codes = codes;
            this.longueurOriginale = longueurOriginale;
            this.longueurCompressee = longueurCompressee;
            this.tauxCompression = tauxCompression;
        }
    }
}
