/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 *
 * @author Firas
 */
public class Acceuil extends javax.swing.JFrame {

    /**
     * Creates new form Acceuil
     */
    public Acceuil() {
        initComponents();
        this.setTitle(" Firas Abdelmoumen & Rayen Idoudi - Compresseur des textes");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Affichage = new javax.swing.JScrollPane();
        AffichageT = new javax.swing.JTextArea();
        encoded = new javax.swing.JScrollPane();
        encodedT = new javax.swing.JTextArea();
        Text = new javax.swing.JScrollPane();
        TextT = new javax.swing.JTextArea();
        Stats = new javax.swing.JButton();
        Decoder = new javax.swing.JButton();
        Clear = new javax.swing.JButton();
        Display = new javax.swing.JLabel();
        FanoShannon = new javax.swing.JButton();
        Huffman = new javax.swing.JButton();
        LRE = new javax.swing.JButton();
        importer = new javax.swing.JButton();
        FileName = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AffichageT.setBackground(new java.awt.Color(249, 249, 249));
        AffichageT.setColumns(20);
        AffichageT.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        AffichageT.setLineWrap(true);
        AffichageT.setRows(3);
        AffichageT.setWrapStyleWord(true);
        AffichageT.setAlignmentX(2.0F);
        AffichageT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        AffichageT.setCaretColor(new java.awt.Color(255, 0, 0));
        AffichageT.setDisabledTextColor(new java.awt.Color(153, 153, 153));
        AffichageT.setMaximumSize(new java.awt.Dimension(100000, 100000));
        AffichageT.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                AffichageTComponentShown(evt);
            }
        });
        Affichage.setViewportView(AffichageT);

        getContentPane().add(Affichage, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, 1150, 100));

        encodedT.setColumns(20);
        encodedT.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        encodedT.setLineWrap(true);
        encodedT.setRows(3);
        encodedT.setAlignmentX(2.0F);
        encodedT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 4));
        encodedT.setCaretColor(new java.awt.Color(255, 0, 0));
        encodedT.setMaximumSize(new java.awt.Dimension(100000, 100000));
        encodedT.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                encodedTComponentShown(evt);
            }
        });
        encoded.setViewportView(encodedT);

        getContentPane().add(encoded, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 510, 100));

        TextT.setColumns(20);
        TextT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TextT.setForeground(new java.awt.Color(51, 51, 51));
        TextT.setRows(3);
        TextT.setWrapStyleWord(true);
        TextT.setAlignmentX(2.0F);
        TextT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 4));
        TextT.setCaretColor(new java.awt.Color(255, 0, 0));
        Text.setViewportView(TextT);

        getContentPane().add(Text, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 510, 100));

        Stats.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Stats.setForeground(new java.awt.Color(153, 153, 153));
        Stats.setText("STATS");
        Stats.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        Stats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StatsActionPerformed(evt);
            }
        });
        getContentPane().add(Stats, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 540, 160, 40));

        Decoder.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Decoder.setForeground(new java.awt.Color(255, 153, 0));
        Decoder.setText("Décoder");
        Decoder.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 4));
        Decoder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecoderActionPerformed(evt);
            }
        });
        getContentPane().add(Decoder, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 490, 160, 40));

        Clear.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Clear.setForeground(new java.awt.Color(255, 153, 0));
        Clear.setText("Clear");
        Clear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 4));
        Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearActionPerformed(evt);
            }
        });
        getContentPane().add(Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 90, 40));

        Display.setBackground(new java.awt.Color(255, 153, 51));
        Display.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Display.setForeground(new java.awt.Color(255, 255, 255));
        Display.setText("Affichage :");
        getContentPane().add(Display, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 340, -1, -1));

        FanoShannon.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        FanoShannon.setForeground(new java.awt.Color(255, 102, 102));
        FanoShannon.setText("Fano-Shannon");
        FanoShannon.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 4));
        FanoShannon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FanoShannonActionPerformed(evt);
            }
        });
        getContentPane().add(FanoShannon, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 240, 160, 40));

        Huffman.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        Huffman.setForeground(new java.awt.Color(255, 102, 102));
        Huffman.setText("Huffman");
        Huffman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 4));
        Huffman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HuffmanActionPerformed(evt);
            }
        });
        getContentPane().add(Huffman, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 240, 160, 40));

        LRE.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        LRE.setForeground(new java.awt.Color(255, 102, 102));
        LRE.setText("LRE");
        LRE.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 4));
        LRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LREActionPerformed(evt);
            }
        });
        getContentPane().add(LRE, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 160, 40));

        importer.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        importer.setForeground(new java.awt.Color(255, 102, 102));
        importer.setText("Importer");
        importer.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 4));
        importer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importerActionPerformed(evt);
            }
        });
        getContentPane().add(importer, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 70, 90, 40));

        FileName.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        FileName.setForeground(new java.awt.Color(153, 153, 153));
        FileName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 102), 4));
        FileName.setCaretColor(new java.awt.Color(255, 255, 255));
        FileName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileNameActionPerformed(evt);
            }
        });
        getContentPane().add(FileName, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 400, 40));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HuffmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HuffmanActionPerformed
        // TODO add your handling code here:     
        test=2;
        encodedT.setText(HuffmanC(TextT.getText().toString()));
        
        
    }//GEN-LAST:event_HuffmanActionPerformed

    private void LREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LREActionPerformed
        // TODO add your handling code here:
        test=3;
        encodedT.setText(LRE(TextT.getText().toString()));
        
    }//GEN-LAST:event_LREActionPerformed

    private void FileNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileNameActionPerformed

    private void importerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importerActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f= chooser.getSelectedFile();
        String filename=f.getAbsolutePath();
        FileName.setText(filename);
        
        try {
            FileReader reader = new FileReader(filename);
            BufferedReader br = new BufferedReader(reader);
            TextT.read(br, null);
            br.close();
            TextT.requestFocus();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_importerActionPerformed

    private void StatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StatsActionPerformed
        // TODO add your handling code here:
        switch (test) {
            case 1:
                // code block
                AfficherResFano(texte,texteCom,codes);
                break;
            case 2:
                // code block
                AfficherResH(texte,texteCom,codes);
                break;
            case 3:
                // code block
                AfficherResL(texte, texteCom);
                break;
            default:
                JOptionPane.showMessageDialog(encodedT, "Tu dois d'abord compresser un texte !");
        } 
    }//GEN-LAST:event_StatsActionPerformed

    private void ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearActionPerformed
        // TODO add your handling code here:
        reset();
    }//GEN-LAST:event_ClearActionPerformed

    private void DecoderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecoderActionPerformed
        // TODO add your handling code here:
        switch (test) {
            case 1:
                // code block
                encodedT.setText(texteDecompresse);
                break;
            case 2:
                // code block
                encodedT.setText(texteDecompresse);
                break;
            case 3:
                // code block
                encodedT.setText(texteDecompresse);
                
                break;
            default:
                JOptionPane.showMessageDialog(encodedT, "Tu dois d'abord compresser un texte !");
        }
        test=0;
    }//GEN-LAST:event_DecoderActionPerformed

    private void encodedTComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_encodedTComponentShown
        // TODO add your handling code here:
        encodedT.setEditable(false);
    }//GEN-LAST:event_encodedTComponentShown

    private void FanoShannonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FanoShannonActionPerformed
        // TODO add your handling code here:
        test=1;
        encodedT.setText(FanoShannonC(TextT.getText().toString()));

        
    }//GEN-LAST:event_FanoShannonActionPerformed

    private void AffichageTComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_AffichageTComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_AffichageTComponentShown

    /**
     * @param args the command line arguments
     */
    
    static int test=0;
    static String texteDecompresse="";
    static String texteCom="";
    Map<Character, String> codes;
    String texte;
    
    
   String LRE(String txt)
   {
        texte=txt;
        String res="";
        if (!txt.isEmpty())
        {
            res=startL(txt);
        }
        return res;
   }
   

        String startL(String txt)
   {
       // Texte à compresser
       String texteOriginal = txt;
       // Compression du texte
       ResultatL resultatCompression = compresserL(texteOriginal);
       String texteCompresse = resultatCompression.texteCompresse;
       // Décompression du texte compressé
       ResultatL inter=decompresserL(texteCompresse);
       texteCom=texteCompresse;
       return texteCompresse;
   }  
       
     private static ResultatL compresserL(String text) {
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
     
         private  ResultatL decompresserL(String compressedText) {
        StringBuilder decompressed = new StringBuilder();
        for (int i = 0; i < compressedText.length(); i += 2) {
            char character = compressedText.charAt(i + 1);
            int count = Character.getNumericValue(compressedText.charAt(i));
            for (int j = 0; j < count; j++) {
                decompressed.append(character);
            }
        }
        texteDecompresse = decompressed.toString();
        return new ResultatL(decompressed.toString(), 0, decompressed.length() * 8, 0);
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
    
   
           
    public void AfficherResL(String texteOriginal, String texteCompresse) {
        double taux = (double) ((texteOriginal.length()) * 8) / texteCompresse.length();
        String aff = "Longueur originale (bits) : " + texteOriginal.length() * 8+"\n Longueur compressée (bits) : " + texteCompresse.length() + "\n Taux de compression : " + taux*100 + "%";
        AffichageT.setText(aff);
    }
   
    /*------------------------------------------------------*/

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
    
        String HuffmanC(String txt)
    {
        texte=txt;
        String res="";
        if (!txt.isEmpty())
        {
            res=startH(txt);
        }
        return res;
    }
        
          String startH(String txt)
        {
            // Texte à compresser
            String texteOriginal = txt;
            // Compression du texte
            ResultatH resultatCompression = compresserH(texteOriginal);
            String texteCompresse = resultatCompression.texteCompresse;
            codes = resultatCompression.codes;
            // Décompression du texte compressé
            texteDecompresse = decompresserH(texteCompresse, codes);
            texteCom=texteCompresse;
            return texteCompresse;
        }   
          
          
      public String decompresserH(String texteCompresse, Map<Character, String> huffmanCodes) {
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
          
     public ResultatH compresserH(String text) {
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
        generateCodesH(root, "", huffmanCodes);

        String texteCompresse = getCodeTexteCompresseH(text, huffmanCodes);

        int longueurOriginale = text.length() * 8;
        int longueurCompressee = texteCompresse.length();
        double tauxCompression = (double) longueurCompressee / longueurOriginale * 100;

        return new ResultatH(texteCompresse, huffmanCodes, longueurOriginale, longueurCompressee, tauxCompression);
    }
           
        private void generateCodesH(Node node, String code, Map<Character, String> huffmanCodes) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            huffmanCodes.put(node.ch, code);
            return;
        }
        generateCodesH(node.left, code + "0", huffmanCodes);
        generateCodesH(node.right, code + "1", huffmanCodes);
    }   
        
    private String getCodeTexteCompresseH(String texteOriginal, Map<Character, String> huffmanCodes) {
        StringBuilder texteCompresse = new StringBuilder();
        for (char c : texteOriginal.toCharArray()) {
            texteCompresse.append(huffmanCodes.get(c));
        }
        return texteCompresse.toString();
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
        
    public void AfficherResH(String texteOriginal, String texteCompresse, Map<Character, String> codes) {
        double taux = (double)  ((texteOriginal.length()) * 8) / texteCompresse.length();
        String aff = " Codes binaires : " + codes +"\n Longueur originale (bits) : " + texteOriginal.length() * 8+"\n Longueur compressée (bits) : " + texteCompresse.length()+"\n Taux de compression : " + taux*100 +"%";
        AffichageT.setText(aff);
    }
  
    /*----------------------------------------------------*/
    
    public void AfficherResFano(String texteOriginal, String texteCompresse, Map<Character, String> codes) {
        double taux = (double)  ((texteOriginal.length()) * 8) / texteCompresse.length();
        String aff = " Codes binaires : " + codes +"\n Longueur originale (bits) : " + texteOriginal.length() * 8+"\n Longueur compressée (bits) : " + texteCompresse.length()+"\n Taux de compression : " + taux*100 +"%";
        AffichageT.setText(aff);
    }
   
    String FanoShannonC(String txt)
    {
        texte=txt;
        String res="";
        if (!txt.isEmpty())
        {
            res=startFSC(txt);
        }
        return res;
    }
        
        String startFSC(String txt)
        {
            // Texte à compresser
            String texteOriginal = txt;
            // Compression du texte
            Resultat resultatCompression = compresser(texteOriginal);
            String texteCompresse = resultatCompression.texteCompresse;
            codes = resultatCompression.codes;
            // Décompression du texte compressé
            texteDecompresse = decompresser(texteCompresse, codes);
            texteCom=texteCompresse;
            return texteCompresse;
        }
        
        public static String decompresser(String texteCompresse, Map<Character, String> codes) {
        StringBuilder texteDecomprime = new StringBuilder();
        StringBuilder codeActuel = new StringBuilder();

        for (int i = 0; i < texteCompresse.length(); i++) {
            codeActuel.append(texteCompresse.charAt(i));
            for (Map.Entry<Character, String> entry : codes.entrySet()) {
                if (entry.getValue().equals(codeActuel.toString())) {
                    texteDecomprime.append(entry.getKey());
                    codeActuel.setLength(0);
                    break;
                }
            }
        }

        return texteDecomprime.toString();
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

            // Construction du texte compressé
            StringBuilder texteCompresse = new StringBuilder();
            for (char c : texte.toCharArray()) {
                texteCompresse.append(codes.get(c));
            }

            return new Resultat(texteCompresse.toString(), codes);
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

            public Resultat(String texteCompresse, Map<Character, String> codes) {
                this.texteCompresse = texteCompresse;
                this.codes = codes;
        }
    }
    
    void reset()
    {
        TextT.setText(null);
        FileName.setText(null);
        encodedT.setText(null);
        AffichageT.setText(null);
        test=0;
        
    }
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acceuil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acceuil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane Affichage;
    private javax.swing.JTextArea AffichageT;
    private javax.swing.JLabel Background;
    private javax.swing.JButton Clear;
    private javax.swing.JButton Decoder;
    private javax.swing.JLabel Display;
    private javax.swing.JButton FanoShannon;
    private javax.swing.JTextField FileName;
    private javax.swing.JButton Huffman;
    private javax.swing.JButton LRE;
    private javax.swing.JButton Stats;
    private javax.swing.JScrollPane Text;
    private javax.swing.JTextArea TextT;
    private javax.swing.JScrollPane encoded;
    private javax.swing.JTextArea encodedT;
    private javax.swing.JButton importer;
    // End of variables declaration//GEN-END:variables
}
