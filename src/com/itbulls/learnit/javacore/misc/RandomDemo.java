package com.itbulls.learnit.javacore.misc;

import java.util.Random;

public class RandomDemo {

    public static void main(String[] args) {
        Random r = new Random(); // Crée un nouvel objet Random pour générer des nombres aléatoires

        System.out.println(r.nextInt()); // Génère et affiche un entier aléatoire quelconque

        System.out.println(r.nextInt(100)); // Génère et affiche un entier aléatoire compris entre 0 (inclus) et 99 (exclusif)

        System.out.println(r.nextInt(100) + 1); // Génère et affiche un entier aléatoire compris entre 1 (inclus) et 100 (inclus)
    }
}
