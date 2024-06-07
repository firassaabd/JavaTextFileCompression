import java.text.DecimalFormat;

public class RunLengthEncoding {
    public static void main(String[] args) {
        String text = "Bonjour, le monde est beau !";

        // Compression
        ResultatL resultatCompression = compress(text);
        afficherResultatsCompression(resultatCompression);

        // Décompression
        ResultatL resultatDecompression = decompress(resultatCompression.texteCompresse);
        afficherResultatDecompression(resultatDecompression);
    }

    private static ResultatL compress(String text) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i <= text.length(); i++) {
            if (i == text.length() || text.charAt(i) != text.charAt(i - 1)) {
                compressed.append(count).append(text.charAt(i - 1));
                count = 1;
            } else {
                count++;
            }
        }
        int longueurOriginale = text.length() * 8;
        int longueurCompressee = compressed.length();
        double tauxCompression = (double) longueurCompressee / longueurOriginale * 100;
        return new ResultatL(compressed.toString(), longueurOriginale, longueurCompressee, tauxCompression);
    }

    private static ResultatL decompress(String compressedText) {
        StringBuilder decompressed = new StringBuilder();
        for (int i = 0; i < compressedText.length(); i += 2) {
            char character = compressedText.charAt(i + 1);
            int count = Character.getNumericValue(compressedText.charAt(i));
            for (int j = 0; j < count; j++) {
                decompressed.append(character);
            }
        }
        return new ResultatL(decompressed.toString(), 0, decompressed.length() * 8, 0);
    }

    private static void afficherResultatsCompression(ResultatL resultat) {
        System.out.println("Texte original : " + resultat.texteCompresse);
        System.out.println("Longueur originale (bits) : " + resultat.longueurOriginale);
        System.out.println("Longueur compressée : " + resultat.longueurCompressee);
        System.out.println("Taux de compression : " + new DecimalFormat("#.##").format(resultat.tauxCompression) + "%");
    }

    private static void afficherResultatDecompression(ResultatL resultat) {
        System.out.println("Texte décompressé : " + resultat.texteCompresse);
        System.out.println("Longueur compressée : " + resultat.longueurCompressee);
    }

    static class ResultatL {
        String texteCompresse;
        int longueurOriginale;
        int longueurCompressee;
        double tauxCompression;

        public ResultatL(String texteCompresse, int longueurOriginale, int longueurCompressee, double tauxCompression) {
            this.texteCompresse = texteCompresse;
            this.longueurOriginale = longueurOriginale;
            this.longueurCompressee = longueurCompressee;
            this.tauxCompression = tauxCompression;
        }
    }
}
