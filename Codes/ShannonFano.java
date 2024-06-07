import java.util.*;

public class ShannonFano {

    public static void main(String[] args) {
        // Texte à compresser
        String texte = "hello girl how are u ?";

        // Compression du texte et récupération des résultats
        Resultat resultat = compresser(texte);
        String texteCompresse = resultat.texteCompresse;
        Map<Character, String> codes = resultat.codes;
        int longueurOriginale = resultat.longueurOriginale;
        int longueurCompressee = resultat.longueurCompressee;
        double tauxCompression = resultat.tauxCompression;

        // Affichage des résultats
        System.out.println("Texte original : " + texte);
        System.out.println("Texte compressé : " + texteCompresse);
        System.out.println("Codes binaires : " + codes);
        System.out.println("Longueur originale (bits) : " + longueurOriginale);
        System.out.println("Longueur compressée (bits) : " + longueurCompressee);
        System.out.println("Taux de compression : " + tauxCompression);
    }

    public static Resultat compresser(String texte) {
        // Calculer la fréquence de chaque caractère dans le texte
        Map<Character, Integer> frequencies = new HashMap<>();
        for (char c : texte.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }

        // Tri des caractères par fréquence décroissante
        List<Map.Entry<Character, Integer>> symboles = new ArrayList<>(frequencies.entrySet());
        symboles.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        // Création des codes
        Map<Character, String> codes = new HashMap<>();
        creerCodes(symboles, codes, "", 0, symboles.size());

        // Calcul de la longueur originale et compressée
        int longueurOriginale = texte.length() * 8; // 1 caractère = 8 bits
        int longueurCompressee = texte.chars().mapToObj(c -> codes.get((char) c)).mapToInt(String::length).sum();

        // Calcul du taux de compression
        double tauxCompression = (double) longueurCompressee / longueurOriginale;

        // Construction du texte compressé
        StringBuilder texteCompresse = new StringBuilder();
        for (char c : texte.toCharArray()) {
            texteCompresse.append(codes.get(c));
        }

        return new Resultat(texteCompresse.toString(), codes, longueurOriginale, longueurCompressee, tauxCompression);
    }

    private static void creerCodes(List<Map.Entry<Character, Integer>> symboles, Map<Character, String> codes, String prefix, int start, int end) {
        // Cas de base : si le groupe de symboles contient un seul symbole, attribuer le code et retourner
        if (start == end - 1) {
            codes.put(symboles.get(start).getKey(), prefix);
            return;
        }

        // Calcul de la somme totale des fréquences dans le groupe
        int somme = 0;
        for (int i = start; i < end; i++) {
            somme += symboles.get(i).getValue();
        }

        // Initialisation de la somme des fréquences du premier groupe
        int sommeGroupe1 = 0;
        int index = start;

        // Recherche de l'index pour diviser les groupes de manière équilibrée
        while (2 * sommeGroupe1 < somme) {
            sommeGroupe1 += symboles.get(index).getValue();
            index++;
        }

        // Attribution des codes pour chaque groupe
        creerCodes(symboles, codes, prefix + "0", start, index);
        creerCodes(symboles, codes, prefix + "1", index, end);
    }

    static class Resultat {
        String texteCompresse;
        Map<Character, String> codes;
        int longueurOriginale;
        int longueurCompressee;
        double tauxCompression;

        public Resultat(String texteCompresse, Map<Character, String> codes, int longueurOriginale, int longueurCompressee, double tauxCompression) {
            this.texteCompresse = texteCompresse;
            this.codes = codes;
            this.longueurOriginale = longueurOriginale;
            this.longueurCompressee = longueurCompressee;
            this.tauxCompression = tauxCompression;
        }
    }
}
