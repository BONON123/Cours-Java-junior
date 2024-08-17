package com.itbulls.learnit.javacore.string;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

    public static void main(String[] args) {
        System.out.println("===== Expressions régulières =====");
        System.out.println();

        // **1. Modèle d'adresse Gmail**
        String gmailPattern = "[a-zA-Z-\\d]+@gmail\\.com"; // [a-zA-Z-\\d] : lettres majuscules et minuscules, chiffres et tirets ; @ : symbole arobase ; \\.com : extension .com
        Pattern p = Pattern.compile(gmailPattern); // Compile le modèle en un objet Pattern

        // **2. Texte d'exemple**
        String sampleText = "Du texte aléatoire contenant des adresses Gmail "
                + "comme celle-ci some-email@gmail.com. Et d'autre texte aléatoire.";

        // **3. Recherche d'adresse Gmail**
        Matcher m = p.matcher(sampleText); // Crée un objet Matcher pour appliquer le modèle au texte
        if (m.find()) { // Recherche la première occurrence correspondant au modèle
            String gmailAddress = m.group(); // Récupère l'adresse Gmail trouvée
            System.out.println(gmailAddress); // Affiche l'adresse Gmail extraite
        } else {
            System.out.println("Aucune adresse Gmail trouvée"); // Message si aucune adresse n'est trouvée
        }

        // **4. Séparation de phrases**
        String sampleText2 = "Il y a trois phrases dans cette chaîne. Êtes-vous sûr ? Oui !";
        String[] sentences = sampleText2.split("[\\.!?]"); // Sépare le texte en phrases en utilisant les points d'interrogation, points d'exclamation et points comme séparateurs
        System.out.println(Arrays.toString(sentences)); // Affiche le tableau de phrases
    }
}
