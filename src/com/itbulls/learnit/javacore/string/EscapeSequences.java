package com.itbulls.learnit.javacore.string;

public class EscapeSequences {

    public static void main(String[] args) {
        System.out.println("===== Séquences d'échappement =====");
        System.out.println();

        System.out.println("Mon livre préféré est \"The one thing\" par Gary Keller."); // Utilisation de \" pour inclure des guillemets dans la chaîne
        System.out.println("Chemin vers le code source : D:\\Java\\sources"); // Utilisation de \\ pour inclure un backslash dans le chemin

        /*
            \t - Tabulation horizontale.
            \b - Retour arrière (un pas en arrière dans le texte ou suppression d'un caractère).
            \n - Nouvelle ligne.
            \r - Retour chariot (moins utilisé de nos jours).
            \f - Saut de page (peu utilisé).
            \' - Apostrophe (simple quote).
            \" - Guillemet double.
            \\ - Backslash.
         */

        System.out.println("ligne de texte 1\nligne de texte 2"); // \n pour un saut de ligne

        System.out.println("Caractères Unicode, \u00A9 IT-Bulls.com"); // \u00A9 pour insérer le symbole copyright ©
    }
}
