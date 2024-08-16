package com.itbulls.learnit.javacore.string;

public class StringComparisonDemo {

    public static void main(String[] args) {
        System.out.println("===== String comparison =====");
        System.out.println();

        String s = " hello "; // Déclaration d'une chaîne de caractères
        String s2 = " hello "; // Déclaration d'une autre chaîne de caractères avec le même contenu

        System.out.println("s == s2: " + (s == s2)); // Comparaison de références (true car les chaînes sont internées)

        String s3 = new String(" hello "); // Création d'un nouvel objet String avec le même contenu
        System.out.println("s == s3: " + (s == s3)); // Comparaison de références (false car objets différents)
        System.out.println("s.equals(s3): " + s.equals(s3)); // Comparaison de contenu (true car les chaînes sont égales)
        System.out.println("s == s3.intern(): " + (s == s3.intern())); // Comparaison de références après internement (true car la chaîne est internée)

        String firstName = "Andrii"; // Déclaration d'une chaîne de caractères
        String firstName2 = "andrii"; // Déclaration d'une autre chaîne de caractères avec des minuscules

        System.out.println("firstName.equals(firstName2): " + firstName.equals(firstName2)); // Comparaison de contenu sans distinction de casse (false)
        System.out.println("firstName.equalsIgnoreCase(firstName2): " + firstName.equalsIgnoreCase(firstName2)); // Comparaison de contenu avec ignorance de la casse (true)
    }
}
