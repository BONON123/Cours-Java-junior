package com.itbulls.learnit.javacore.math;

public class MathClassDemo {

    public static void main(String[] args) {
        System.out.println(Math.PI); // Affiche la valeur de la constante Pi
        System.out.println(Math.max(3, 5)); // Retourne le plus grand nombre entre 3 et 5
        System.out.println(Math.min(3, 5)); // Retourne le plus petit nombre entre 3 et 5
        System.out.println(Math.sqrt(4)); // Calcule la racine carrée de 4
        int absoluteValue = Math.abs(-5); // Calcule la valeur absolue de -5
        System.out.println(absoluteValue); // Affiche la valeur absolue

        System.out.println(Math.sqrt(-1)); // Racine carrée d'un nombre négatif, retourne NaN (Not a Number)
        System.out.println(0 / 0.0); // Division par zéro, retourne NaN
        System.out.println((0 / 0.0) + 5); // Opération avec NaN, résultat NaN

        System.out.println(5 / 0.0); // Division d'un nombre par zéro, retourne Infinity
        System.out.println(-5 / 0.0); // Division d'un nombre négatif par zéro, retourne -Infinity

        System.out.println(Math.round(20.0 / 3.0)); // Arrondi à l'entier le plus proche de 20 divisé par 3
        System.out.println(Math.round(20.0 * 100.0 / 3.0) / 100.0); // Arrondi à deux décimales de 20 divisé par 3

        System.out.println(Math.random()); // Génère un nombre aléatoire entre 0.0 (inclus) et 1.0 (exclu)
        System.out.println((int)(Math.random() * 100)); // Génère un nombre aléatoire entier entre 0 et 99
        System.out.println((int)(Math.random() * 100) + 100); // Génère un nombre aléatoire entier entre 100 et 199
    }
}
