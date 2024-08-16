package com.itbulls.learnit.javacore.string;

import java.util.Arrays;

public class StringMainMethodsOverview {

    public static void main(String[] args) {
        System.out.println("===== String methods =====");
        System.out.println();

        String s = " hello "; // Déclaration d'une chaîne de caractères avec des espaces

        System.out.println("s.length(): " + s.length()); // Renvoie la longueur de la chaîne (7 caractères)
        System.out.println("s.contains(\"he\"): " + s.contains("he")); // Vérifie si la chaîne contient le sous-chaîne "he" (true)
        System.out.println("s.isEmpty: " + s.isEmpty()); // Vérifie si la chaîne est vide (false)
        System.out.println("s.toUpperCase(): " + s.toUpperCase()); // Convertit la chaîne en majuscules (HELLO)
        System.out.println("s.startsWith(\"h\"): " + s.startsWith("h")); // Vérifie si la chaîne commence par "h" (false car il y a un espace au début)
        System.out.println("s.endsWith(\" \"): " + s.endsWith(" ")); // Vérifie si la chaîne termine par un espace (true)
        System.out.println("s.replace(\"ll\", \"LL\"): " + s.replace("ll", "LL")); // Remplace toutes les occurrences de "ll" par "LL" (heLLo)
        System.out.println("s.trim(): " + s.trim()); // Supprime les espaces blancs au début et à la fin de la chaîne (hello)
        System.out.println("s.strip(): " + s.strip()); // Supprime les espaces blancs au début et à la fin de la chaîne (équivalent à trim())
        System.out.println("s.substring(0, 3): " + s.substring(0, 3)); // Extrait une sous-chaîne de l'index 0 à 2 (exclusif) (he)
        System.out.println("Arrays.toString(s.getBytes()): " + Arrays.toString(s.getBytes())); // Convertit la chaîne en tableau d'octets (représentation ASCII)
        System.out.println("Arrays.toString(s.toCharArray()): " + Arrays.toString(s.toCharArray())); // Convertit la chaîne en tableau de caractères
        System.out.println("s.charAt(1): " + s.charAt(1)); // Renvoie le caractère à l'index 1 (h)
        System.out.println("Arrays.toString(s.split(\"e\")): " + Arrays.toString(s.split("e"))); // Divise la chaîne en un tableau de sous-chaînes en utilisant "e" comme séparateur
        System.out.println(s); // Affiche la chaîne originale (hello)
    }
}
